package com.mclientui.proxies;

import com.mclientui.bean.ProductBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// (, decode404 = true) => cette argument permet de passer l'erreur et donc d'éviter de lancer la fameuse 'FeignException'
// @FeignClient(name = "microservice-produits", url = "localhost:9002")
@FeignClient(name="zuul-server")
@RibbonClient(name="microservice-produits")
public interface MicroserviceProduitsProxy {

    @GetMapping(value = "/microservice-produits/Produits")
    List<ProductBean> listeDesProduits();

    @GetMapping( value = "/microservice-produits/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);

}