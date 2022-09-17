package br.com.rrvrafael;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.rrvrafael.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(1, "TreinaWeb 1"));
        pessoas.add(new Pessoa(2, "TreinaWeb 2"));
        pessoas.add(new Pessoa(3, "TreinaWeb 3"));
        pessoas.add(new Pessoa(4, "TreinaWeb 4"));

        // System.out.println("Pessoas cadastradas:\n" + pessoas);

        // System.out.println("Com For:");
        // for (int i = 0; i < pessoas.size(); i++) {
        //     System.out.println(pessoas.get(i));
        //     // System.out.println(pessoas.get(i).getId());
        // }

        System.out.println("Com Iterator:");
        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();

        while (iteratorPessoa.hasNext()) {
            Pessoa pessoa = iteratorPessoa.next();

            if (pessoa.getId() == 1) {
                iteratorPessoa.remove();
            }
            System.out.println(pessoa);
        }

        //For-each
        System.out.println("Com For-each:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
