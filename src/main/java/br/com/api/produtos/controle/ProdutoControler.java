package br.com.api.produtos.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoControler {

    @GetMapping
    public String rota(){
        return  "API de produtos funcionando!";
    }

}
