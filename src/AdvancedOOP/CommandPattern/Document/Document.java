package AdvancedOOP.CommandPattern.Document;

// Receiver
class Document {
    private final StringBuilder sb = new StringBuilder();

    void append(String s) { sb.append(s); }
    String deleteLast(int n) { // 뒤에서 n글자 삭제 후, 삭제된 문자열 반환
        n = Math.min(n, sb.length());
        String removed = sb.substring(sb.length() - n); // 삭제된 문자열 -> 인덱스 번호 (sb.length() - n) 부터 끝까지의 문자를 전달
        sb.setLength(sb.length() - n); // n글자를 삭제한 값을 sb에 적용시켜주기, n 글자를 삭제한 길이로 sb를 강제로 맞춰주는 것 뒤에는 잘라서 버림!
        return removed;
    }

    // 문자열 출력
    void show() { System.out.println("[" + sb + "]"); }
}