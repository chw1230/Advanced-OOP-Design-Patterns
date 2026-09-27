package AdvancedOOP.DecoratorPattern.과제노트북외부주변기기;

public class ComputerMain {

    public static void main(String[] args) {
        // 가장 안쪽에 노트북 만들기
        // 변수 타입은 가장 위 타입인 InterfaceNotebookComputer로 해야 노트북, 주변기기 둘 다 담을 수 있음!
        InterfaceNotebookComputer computer = new NotebookComputer("홍길동");
        System.out.println(computer);

        // 주변기기로 기존 객체를 감싸고, 감싼 결과를 다시 같은 변수에 넣기!
        System.out.println("외부 모니터 추가. 요구 공간 150 추가");
        computer = new Monitor(computer);
        System.out.println(computer);

        System.out.println("외부 모니터 추가. 요구 공간 150 추가");
        computer = new Monitor(computer);
        System.out.println(computer);

        System.out.println("외부 키보드 추가. 요구 공간 80 추가");
        computer = new Keyboard(computer);
        System.out.println(computer);

        System.out.println("외부 마우스 추가. 요구 공간 30 추가");
        computer = new Mouse(computer);
        System.out.println(computer);

        System.out.println("외부 하드 드라이브 추가. 요구 공간 40 추가");
        computer = new ExternalHardDrive(computer);
        System.out.println(computer);
    }
}
