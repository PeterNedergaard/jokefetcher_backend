package dtos;

public class DadDTO {

    private String joke;
    private String url = "https://icanhazdadjoke.com";

    public DadDTO(String joke, String url) {
        this.joke = joke;
        this.url = url;
    }

    public DadDTO() {
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
