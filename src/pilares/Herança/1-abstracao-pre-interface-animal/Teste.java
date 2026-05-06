class abstract Pai { //generalização abstrata

    void paiUm(){
    }      

    void abstract paiDois();

}


class Filha extends Pai { //Filha is a Pai: especialização concreta

    void filhaUm(){        
    }

    @Override
    void paiDois(){
    }


}

Pai pai = new Filha();
Filha filha = new Filha();
