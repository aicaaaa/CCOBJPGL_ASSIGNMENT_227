public class Study {
    static boolean iWillReview = true;
    static boolean iWillNotFail = true;

    public static void main(String[] args) throws Exception {
        Study myStudy = new Study();

        // precondition
        assert iWillReview == true : "hindi ka makakagraduate";

        myStudy.review();

        // post condition
        assert iWillNotFail == true : "uno ka!";

    }

    void review() {

        iWillNotFail = false;
    }
}
