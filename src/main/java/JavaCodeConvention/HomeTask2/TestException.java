package JavaCodeConvention.HomeTask2;

class TestException {

    void testException(Double amount) throws MeException {

        if (amount < 0) {
                throw new MeException();
        }
    }

}
