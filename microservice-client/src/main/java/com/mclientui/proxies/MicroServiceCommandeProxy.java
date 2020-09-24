package com.mclientui.proxies;

import com.mclientui.bean.CommandeBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "zuul-server")
@RibbonClient(name="microservice-commandes")
public interface MicroServiceCommandeProxy {

    @PostMapping(value="/microservice-commandes/commandes")
    CommandeBean ajouterCommande(@RequestBody CommandeBean commandeBean);

    @GetMapping(value = "/microservice-commandes/commandes/{id}")
    CommandeBean recupererUneCommande(@PathVariable int id);
}
