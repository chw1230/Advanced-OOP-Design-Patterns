package AdvancedOOP.DecoratorPattern.디스플레이실습;

import java.util.List;

public class DisplayMain2 {
    public static void main(String[] args) {
        List<String> list;
        LoadDisplayModules loadDisplay = new LoadDisplayModules("src/AdvancedOOP/DecoratorPattern/디스플레이실습/displays.txt");
        list = loadDisplay.load();
        // 디버깅 목적. displays.txt파일의 내용을 확인하고 싶으면 다음 네 줄의 코드를 주석에서 해제할 것
//        System.out.printf("display.size() = %d\n", list.size());
//        for (String s : list) {
//            System.out.println(s);
//        }

        // 1. 리스트의 첫 번째 요소는 시스템 이름
        Display display = new TitleDisplay(list.get(0), 60, 3);
        // 나머지 디스플레이 모듈이 있으면, 기존 디스플레이를 감싸는 형태로 처리
        for (int i = 1; i < list.size(); i++) {
            String moduleName = list.get(i);
            if (moduleName.equals("speed")) {
                // 2. txt 파일을 기준으로 보면 타이틀이 담기고, 타이틀을 담고 있는 스피드가 만들어지고
                display = new SpeedometerDisplay(display, 60, 3);
            }
            else if (moduleName.equals("time")) {
                // 3. txt 파일을 기준으로 보면 타이틀을 담은 스피드를 담은 시간이 만들어지고
                display = new TimeDisplay(display, 60, 3);
            }
            else if (moduleName.equals("weather")) {
                // 4. 타이틀을 담은 스피드를 담은 시간을 담은 웨더가 만들어 지는 것
                display = new WeatherDisplay(display, 60, 3);
            }
        }
        display.show();   // 디스플레이 시스템에 있는 모든 화면 출력
    }
}
