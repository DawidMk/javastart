package pl.sda.javastart.day5;

public class ExperimentalObject {
    public static final int HEADS_NUM = 1;
    private Integer notFinalImmutableVal;
    private final Integer finalImmutableVal; //can't change reference (final - blokuje referencję, Integer blokuje zmianę wartości objektu
    private final TestPerson person;

    public TestPerson getPerson() {
        return person;
    }

    public ExperimentalObject(int m, int n, TestPerson person) {
        this.notFinalImmutableVal = m;
        this.finalImmutableVal = n;
        this.person = person;
    }

    public Integer getNotFinalImmutableVal() {
        return notFinalImmutableVal;
    }

    public void setNotFinalImmutableVal(Integer notFinalImmutableVal) {
        this.notFinalImmutableVal = notFinalImmutableVal;
    }

    public Integer getFinalImmutableVal() {
        return finalImmutableVal;
    }

}
