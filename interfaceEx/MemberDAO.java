package interfaceEx;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {

	@Override
	public void insertMember(MemberDTO dto) {
		System.out.println("회원 등록 성공");
		System.out.println(dto);
	}

	@Override
	public void deleteMember(Long memId) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub

	}

}
