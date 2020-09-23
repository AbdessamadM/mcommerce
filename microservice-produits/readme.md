Notes
---
Si je change la valeur de my-configs.limitDeProduits  dans le GIT, puis j'appele de nouveau localhost:9002/Produits. 
J'aurai pas le même nombre de produits retournés, néanmoins avec la relance du Microservice (MproduitsApplication) avec la dependance Spring Actuator.

Au lieu de relancer le Microservice manuellement, je peux envoyer une requête POST à http://localhost:9002/actuator/refresh via Postman.

`[
  "config.client.version",
  "my-configs.limitDeProduits"
]`
<br>
<p>
Ci-dessus la réponse de la requête indiquant le changement de la propriété limitDeProduits
</p>

---