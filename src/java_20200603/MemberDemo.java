package java_20200603;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao1 mdao = new MemberDao1();
		
		int num = 11;
		String name = "택진형2";
		String addr = "한국2";
		
		//MemberDto m = new MemberDto(num, name, addr);	// 쓸데없이 만들지 말고 아래에 직접 사용
		
		/*
		int resultCount = mdao.insert(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("정상적인 회원가입이 되었습니다.");
		}else {
			System.out.println("ERROR...");
		}
		*/
		
		/*
		int resultCount = mdao.update(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("회원이 정상적으로 수정 됬습니다.");
		}else {
			System.out.println("ERROR...");
		}
		*/
		
		/*
		int resultCount = mdao.delete(num);
		if(resultCount == 1) {
			System.out.println("회원이 정상적으로 삭제되었습니다.");
		}else {
			System.out.println("ERROR...");
		}
		*/
		
		/*
		ArrayList<MemberDto> list = mdao.select();		
		for(int i = 0; i<list.size(); i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d, %s, %s%n", _num, _name, _addr);
		}
		System.out.println("==============================================");
		
		for(MemberDto m : list) {
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d, %s, %s%n", _num, _name, _addr);
		}
		System.out.println("==============================================");
		*/
		
		
		MemberDto mdto = mdao.select(num);
		if(mdto != null) {
			int _num = mdto.getNum();
			String _name = mdto.getName();
			String _addr = mdto.getAddr();
			System.out.printf("%d, %s, %s%n", _num, _name, _addr);
		}else {
			System.out.println("회원정보가 없습니다.");
		}
		
	}
}
