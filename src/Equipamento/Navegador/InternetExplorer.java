package src.Equipamento.Navegador;

public class InternetExplorer implements NavegadorInternet{
    @Override
    public void pagina() {
        System.out.println("Pagina Aberta");
    }

    @Override
    public void adicionandoNovaPagina() {
        System.out.println("Adicionar nova pagina");
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Atualizando pagina");
    }
}
