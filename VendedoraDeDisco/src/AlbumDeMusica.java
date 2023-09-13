public class AlbumDeMusica {

    //ATRIBUTOS//
    private String titulo;
    private String descricao;
    private String autor;
    private int anodelancamento;
    private int quantasmusicas;

    //Construtor vazio//
    public AlbumDeMusica(){}

    //Construtores "cheios"//

    public AlbumDeMusica(String titulo, int quantasmusicas, String descricao) {
        this.titulo = titulo;
        this.quantasmusicas = quantasmusicas;
        this.descricao = descricao;
    }

    public AlbumDeMusica(String titulo, int quantasmusicas, String descricao, String autor, int anodelancamento) {
        this.titulo = titulo;
        this.quantasmusicas = quantasmusicas;
        this.descricao = descricao;
        this.autor = autor;
        this.anodelancamento = anodelancamento;
    }

    //Getters e Setters//

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantasmusicas() {
        return quantasmusicas;
    }

    public void setQuantasmusicas(int quantasmusicas) {
        this.quantasmusicas = quantasmusicas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnodelancamento() {
        return anodelancamento;
    }

    public void setAnodelancamento(int anodelancamento) {
        this.anodelancamento = anodelancamento;
    }

    //função//
        public void Tocar(){
        System.out.println( titulo +" tocando...");


        }

    //to string//
    @Override
    public String toString() {
        return "====SEU ALBUM FOI CADASTRADO====\r\nTitulo: " + titulo +
                "\r\nDescrição: " + descricao + "\r\nAutor: " + autor +
                "\r\nQtd de Musicas: " + quantasmusicas + "\r\nAno de Lançamento: " +
                anodelancamento;
    }



}



