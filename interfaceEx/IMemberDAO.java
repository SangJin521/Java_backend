package interfaceEx;

import java.util.ArrayList;

public interface IMemberDAO {
	public void insertMember(MemberDTO dto); //회원등록
	public void deleteMember(Long memId); //삭제
	public ArrayList<MemberDTO> getAllMember(); //조회
	public void updateMember(MemberDTO dto); //수정
}
