public class Main {

    public static void main(String[] args) {
        Man[] Shtab = new Man[9];
        int a = 0;
        for (int i = 0; i < 9; i++) {

            if (i < 6) {
                Shtab[i] = new Soldier("Soldat" + i, 30 + i);
            } else if (i < 8) {
                if ( i == 7) {a = 3;}

                Shtab[i] = new Comander("Comand" + i, 40 + i, (Soldier) Shtab[0 + a], (Soldier) Shtab[1 + a], (Soldier) Shtab[2 + a] );
                ((Soldier) Shtab[0+a]).setComander(Shtab[i]);
                ((Soldier) Shtab[1+a]).setComander(Shtab[i]);
                ((Soldier) Shtab[2+a]).setComander(Shtab[i]);

            }

        }
        Shtab[8] = new General("General", 50, (Comander) Shtab[6], (Comander) Shtab[7] );
        ((Comander) Shtab[6]).setComander(Shtab[8]);
        ((Comander) Shtab[7]).setComander(Shtab[8]);
//        for (Man temp:Shtab) {
//            System.out.println(temp.getName());
//        }

        System.out.println(Shtab[5].getName());

    }
}
