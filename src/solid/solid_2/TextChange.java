package solid.solid_2;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class TextChange {

    void allLettersToUpperCase(Text text) {
        String tempText = text.getText();
        String result = tempText.toUpperCase();
        text.setText(result);
    }

    void findSubTextAndDelete(Text text, String s) {
        StringBuilder sb = new StringBuilder();
        String str = text.getText();
        if(str.contains(s)) {
            int idx = str.indexOf(s);
            sb.append(str.substring(0, idx)).append(str.substring(idx+s.length(), str.length()));
            text.setText(sb.toString());

        } else {
            System.out.println("찾는 subText가 없음");
        }
    }
}
