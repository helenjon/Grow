package JavaBasics.HomeTask_HT3_1;

enum Card {
        JackCher ("Jack", "Cher"),
        IceCher ("Ice", "Cher"),
        TenCher ("Ten", "Cher"),
        JackIce ("Jack", "Ice"),
        IceIce ("Ice", "Ice"),
        TenIce ("Ten", "Ice"),
        eightIce ("eight", "Cher"),
        nineIce ("nine", "Cher"),
        eightCher ("eight", "Cher"),
        nineCher ("nine", "Cher"),
        sevenCher ("seven", "Cher"),
       fourCher ("four", "Cher"),
       fourIce ("four", "Ice"),
       fiveCher ("five", "Cher"),
        fiveIce ("five", "Ice");

    private String rank;
        private String suit;

     Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String getRank() {
            return rank;
        }

        public String getSuit() {
            return suit;
        }
}











