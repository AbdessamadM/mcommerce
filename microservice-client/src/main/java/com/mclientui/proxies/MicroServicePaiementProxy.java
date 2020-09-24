package com.mclientui.proxies;

import com.mclientui.bean.PaiementBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "zuul-server")
@RibbonClient(name="microservice-paiement")
public interface MicroServicePaiementProxy {

    @PostMapping(value = "/microservice-paiement/paiement")
    ResponseEntity<PaiementBean> payerUneCommande(@RequestBody PaiementBean paiementBean);
}
