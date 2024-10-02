package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main40 {
  public static void main(String[] args) {
    // - Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc
    // ký tự đặc
    // biệt
    // Ví dụ hợp lệ: 099145697413 - bắt buộc số 0 đứng đầu
    // không hợp lệ: 09914569741a (chứa ký tự là chữ số)
    Pattern pattern0 = Pattern.compile("^0[0-9]{11}$");// 0\\d{12,}
    Matcher matcher0 = pattern0.matcher("099145697412");
    System.out.println("Input String matches regex0 - " + matcher0.matches());

    // - Mật khẩu: có ít nhất 6 ký tự
    // ví dụ hợp lệ: 123456
    // không hợp lệ: 12345 (chứa 5 ký tự)
    Pattern pattern1 = Pattern.compile("\\d{6,}"); // [0-9]d{6,}
    Matcher matcher1 = pattern1.matcher("123456");
    System.out.println("Input String matches regex1 - " + matcher1.matches());

    // - Email : cần có ký tự @ và dấu chấm (.)
    // ví dụ hợp lệ: eric@hoidanit.com.vn
    // không hợp lệ: abc#blabla (không chứa @ và dấu chấm)
    Pattern pattern2 = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    // ^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$
    Matcher matcher2 = pattern2.matcher("abc#blabla");
    System.out.println("Input String matches regex2 - " + matcher2.matches());

  }
}
