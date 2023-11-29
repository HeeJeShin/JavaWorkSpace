package chap_01;

public class _Quiz_01 {
    /*
    * (실행결과 _
    * 상암08번 버스
    * 약 3분 후 도착
    * 남은거리 1.2km
    * */
    public static void main01(String[] args){
        // 버스 번호
        String busNo = "상암08";
        // 남은 시간
        int minute = 3;

        // 남은 거리
        double distance = 1.2;

        System.out.println(busNo + "번 버스");
        System.out.println("약" + minute + "분 후 도착");
        System.out.println("남은 거리" + distance + "km");
    }
}
