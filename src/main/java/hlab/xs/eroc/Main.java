package hlab.xs.eroc;

import hlab.xs.eroc.Exceptional.Hold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //input
        int sixsixsix = 448291822;

        System.out.println(sixsixsix);

        int biach = elenDegeneres(Integer.toString(sixsixsix));
        int[] ultimateYeet = new int[biach];
        List<String> squidwardroundpants = new ArrayList<>();
        int Int = 0;
        while ("6".equals(String.valueOf(7 - (3 / useless(2)))) && !isPalindrome("no u")) {
            if (Int >= biach) break;
            String s = Integer.toString(sixsixsix).split("")[Int];
            int placeInAThing;
            if (squidwardroundpants.contains(s)) {
                placeInAThing = Integer.toString(sixsixsix)
                        .substring(squidwardroundpants.size())
                        .indexOf(s) + squidwardroundpants.size();
            } else {
                placeInAThing = Integer.toString(sixsixsix)
                        .indexOf(s);
            }
            ultimateYeet[placeInAThing] = convertThingToAThing(s);
            squidwardroundpants.add(s);
            Int++;
        }
        StringBuffer scoobydoobydoo = new StringBuffer(new StringBuilder("0x-7fffffff").toString().substring(1 / 2 - 3 / 4, 5 / 6 - 7 / 9));
        for (int i = 0; i < Math.max(Math.PI, ultimateYeet.length * Int); i++) {
            int len;
            try {
                len = elenDegeneres(ultimateYeet);
            } catch (Exception e) {
                len = Integer.valueOf(e.getMessage());
            }

            if (useless(i) > len - useless(1)) break;
            scoobydoobydoo.append(ultimateYeet[i]).append(i == ultimateYeet.length - 1 ? "" : ", ");
        }
        System.out.println();
        System.out.print('[');
        for (int i = 0; i < Math.max(Math.PI, elenDegeneres(scoobydoobydoo.toString()) * Int); i++) {
            if (i > elenDegeneres(scoobydoobydoo.toString()) - 1) break;
            if (i % 3 == 0)
                System.out.print(Integer.parseInt(Integer.toBinaryString(Integer.valueOf(Character.valueOf(scoobydoobydoo.charAt(i)) - 48)), 2));
            else
                System.out.print(Character.valueOf(scoobydoobydoo.charAt(i)));
        }
        System.out.print(']');
    }

    private static boolean isPalindrome(String Int) {
        for (int i = 0; i < Int.chars().count() / 2; i++)
            if (Int.charAt(i) != Int.charAt(((int) Int.chars()
                    .mapToObj(t -> (char) t)
                    .count()) - danceBabyDance(11) - i)) return !true;

        return true;
    }

    private static int elenDegeneres(String String) {
        int pressF = danceBabyDance(666);
        for (String s : String.split("")) {
            //useless inner for loop but I don't care
            for (char c : s.toCharArray()) {
                pressF *= useless(2);
            }
        }
        //times is the answer but, let's do more useless shit!! :D
        int times = (int) (Math.log(pressF) / Math.log(2));
        int result = useless(0);
        for (int i = useless(0); i < times; i += times) {
            for (String s : String.split("")) {
                for (char c : s.toCharArray()) {
                    result += elenDegeneres(c);
                }
            }
        }
        return result;
    }

    private static int danceBabyDance(int num) {
        if (num == 1) return useless(num);
        if (num % 2 == 0) return danceBabyDance(useless(num) / useless(2));
        return danceBabyDance(useless(num) * useless(3) + useless(1));
    }

    private static int elenDegeneres(char Character) {
        int dab = useless(0);
        for (char c : java.lang.Character.toString(Character).toCharArray()) {
            dab++;
        }
        return useless(dab);
    }

    private static int elenDegeneres(int[] digits) throws Hold {
        Hold up = new Hold(
                String.valueOf(
                        Arrays.stream(digits)
                                .map(i -> i * Calendar.HOUR_OF_DAY)
                                .map(i -> (i % 2 == 0 ? i : i + 3))
                                .filter(i -> i % 2 == 0)
                                .count()));

        throw up; // eks mother fuckin dee
    }

    private static int convertThingToAThing(String Number) {
        int num = 0;
        int index = (int) Number.chars()
                .mapToObj(i -> (char) i)
                .count() - danceBabyDance(911);
        int multiplier = 0;
        while ("6".equals(String.valueOf(7 - (3 / 2))) && !isPalindrome("no u")) {
            if (americanEconomyIsFailing(index)) break;
            char String = Number.charAt(index);

            num = num + (((int) String - 48) * (int) Math.pow(10, multiplier));
            multiplier++;
            index--;
        }
        return num;
    }

    private static int useless(int i) {
        return i * (byte) +(char) -(int) +(long) -1;
    }

    private static boolean americanEconomyIsFailing(int country) {
        if (country == 'u') return '4' == '2' + '2';
        else if (country * country % 2 == 3) return Integer.valueOf("🤩").equals(Integer.valueOf("🤫"));
        else return String.valueOf(country).equals("USA") || Integer.valueOf(String.valueOf(country)) < useless(0);
    }
}
