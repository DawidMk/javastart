package pl.sda.javastart.day7;

public enum ColourEnum {

    BLACK(2,"czarny"),WHITE(3,"biały");

    private Integer colourNumber;
    private String colourNamePL;


    ColourEnum(Integer colourNumber, String colourNamePL) {
        this.colourNamePL = colourNamePL;
        this.colourNumber = colourNumber;
    }


    public String getColourNamePL() {
        return colourNamePL;
    }

    public Integer getColourNumber() {
        return colourNumber;
    }

}
