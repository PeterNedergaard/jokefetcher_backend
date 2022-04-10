package dtos;

public class OurDTO {

    String joke1;
    String joke1reference;

    String joke2;
    String joke2reference;

    public OurDTO(ChuckDTO chuckDTO, DadDTO dadDTO) {
        this.joke1 = chuckDTO.getValue();
        this.joke1reference = chuckDTO.getUrl();

        this.joke2 = dadDTO.getJoke();
        this.joke2reference = dadDTO.getUrl();
    }

    public OurDTO() {
    }
}
