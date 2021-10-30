public class Estoque { //clase para armazenar meu produtos numa lista
    public static Produto listaEstoque[] = { //a lista
            new Teclado(171, "Teclado Gamer", 123.00, "Corsair", "K75", "Mecanico", "Com Fio"),
            new Teclado(193,"Teclado Gamer", 564.59, "Razer", "RZ03-03400200-R3U1", " Membrana", "Com Fio"),
            new Teclado(103,"Teclado", 71.90, "HP", "2UN30AAAC4", " Membrana", "Com Fio"),
            new Mouse(349,"Mouse Gamer",75.00, "Redragon", "Cobra 700", 5000, "Sem fio"),
            new Mouse(381,"Mouse Retrátil",24.90, "Multilaser", "MO232", 1200, "Com fio"),
            new Armazenamento(513,"SSD",350.00,"Kingston","KKO120",120,"GB"),
            new Armazenamento(594,"HD",299.90,"Seagate","ST1000DM010",1,"TB"),
            new Cartucho(827,"Cartucho de Tinta",80.00,"HP","HP100","PRETO",2, "ML"),
            new Cartucho(806,"Cartucho de Tinta 667xl",119.00,"HP","3YM80AL","COLORIDO",2, "ML")
    };

    public static Produto buscaEstoque(int cod){ //função para buscar o produto cujo código digitado pelo usuário
        for (int i = 0; i < listaEstoque.length; i++){
            if(cod == listaEstoque[i].getCodProduto()){
                return listaEstoque[i]; //se achar retorna o produto
            }
        }
        return null; //se ele não achar retorna nada
    }
}
