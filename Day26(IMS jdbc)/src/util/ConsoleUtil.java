package util;

import java.util.ArrayList;
import java.util.Scanner;

import dto.IdolGroupDTO;
import dto.SearchDTO;

// 콘솔에서 하는 작업을 정의
public class ConsoleUtil {

	public IdolGroupDTO getNewIdolGroupDTO(Scanner scanner) {
		// TODO Auto-generated method stub
		
		System.out.println("====등록할 아이돌 그룹 정보 입력====");
		System.out.print("아이돌 그룹 이름: ");
		String idolGroupName = scanner.next();
		System.out.print("아이돌 그룹 소속사: ");
		String company = scanner.next();
		System.out.print("아이돌 그룹 성별: ");
		String gender = scanner.next();
		System.out.print("아이돌 그룹 장르: ");
		String genre = scanner.next();
		System.out.print("아이돌 그룹 데뷔연도: ");
		int year = scanner.nextInt();
		System.out.print("아이돌 그룹 대표곡: ");
		String song = scanner.next();
		System.out.print("아이돌 그룹 나이대: ");
		int generation = scanner.nextInt();
		
		IdolGroupDTO newIdolGroupDTO = new IdolGroupDTO();
		newIdolGroupDTO.setCompany(company);
		newIdolGroupDTO.setGender(gender);
		newIdolGroupDTO.setGenre(genre);
		newIdolGroupDTO.setIdolGroupName(idolGroupName);
		newIdolGroupDTO.setSong(song);
		newIdolGroupDTO.setYear(year);
		newIdolGroupDTO.setGeneration(generation);
		
		
		return newIdolGroupDTO;
	}

	// 등록
	
	
	public void printResistSuccessMessage(String idolGroupName) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupName + " 아이돌 그룹 등록 성공");
		
	}
	public void printResistFailMessage(String idolGroupName) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupName + " 아이돌 그룹 등록 실패");
		
	}

	// 목록보기
	public void printIdolGroupList(IdolGroupDTO[] idolGroupArray) {
		// TODO Auto-generated method stub
		if(idolGroupArray.length == 0) {
			System.out.println("아직 등록된 아이돌 그룹이 없습니다.");
		}
		else {
			for (int i = 0; i < idolGroupArray.length; i++) {
				System.out.println(idolGroupArray[i]);
			}
		}
	}

	public String getIdolGroupName(String label, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(label);
		return scanner.next();
	}

	public void printIdolGroupDTO(IdolGroupDTO idolGroupDTO) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupDTO);
	}

	public IdolGroupDTO getNewIdolGroupDTO(IdolGroupDTO oldIdolGroupDTO, Scanner scanner) {
		// TODO Auto-generated method stub

		System.out.println("====수정할 아이돌 그룹 정보 입력====");
		
	    System.out.println("이전 그룹 소속사 : " + oldIdolGroupDTO.getCompany());
		System.out.print("아이돌 그룹 소속사: ");
		String company=scanner.next();
		System.out.println("이전 그룹 성별 : " + oldIdolGroupDTO.getGender());
		System.out.print("아이돌 그룹 성별: ");
		String gender=scanner.next();
		System.out.println("이전 그룹 장르 : " + oldIdolGroupDTO.getGenre());
		System.out.print("아이돌 그룹 장르: ");
		String genre=scanner.next();
		System.out.println("이전 그룹 데뷔연도 : " + oldIdolGroupDTO.getYear());
		System.out.print("아이돌 그룹 데뷔연도: ");
		int year=scanner.nextInt();
		System.out.println("이전 그룹 대표곡 : " + oldIdolGroupDTO.getSong());
		System.out.print("아이돌 그룹 대표곡: ");
		String song=scanner.next();
		System.out.println("이전 나이대 : " + oldIdolGroupDTO.getGeneration());
		System.out.print("아이돌 그룹 나이대: ");
		int generation=scanner.nextInt();
		
		IdolGroupDTO newIdolGroupDTO=new IdolGroupDTO();
		newIdolGroupDTO.setCompany(company);
		newIdolGroupDTO.setGender(gender);
		newIdolGroupDTO.setGenre(genre);
		newIdolGroupDTO.setIdolGroupName(oldIdolGroupDTO.getIdolGroupName());
		newIdolGroupDTO.setSong(song);
		newIdolGroupDTO.setYear(year);
		newIdolGroupDTO.setGeneration(generation);
		
		return newIdolGroupDTO;
	}

	public void printModifySuccessMessage(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameForModify + " 아이돌 그룹 정보 수정 성공");
	}
	public void printModifyFailMessage(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameForModify + " 아이돌 그룹 정보 수정 실패");
	}

	public void printRemoveSuccessMessage(String idolGroupNameForRemove) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameForRemove + " 아이돌 그룹 삭제 성공");
	}

	public void printRemoveFailMessage(String idolGroupNameForRemove) {
		// TODO Auto-generated method stub
		System.out.println(idolGroupNameForRemove + " 아이돌 그룹 삭제 실패");
	}

	public SearchDTO getSearchDTO(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print("검색조건(이름 | 나이대) : ");
		String searchCondition = scanner.next();
		
		if(searchCondition.equals("이름")) {
			System.out.print("검색할 이름 : ");
		}
		else if(searchCondition.equals("나이대")) {
			System.out.print("검색할 나이대 : ");
		}
		String searchValue = scanner.next();
		
		SearchDTO searchDTO = new SearchDTO();
		searchDTO.setSearchCondition(searchCondition);
		searchDTO.setSearchValue(searchValue);
		
		return searchDTO;
	}

	public void printSearchedIdolGroupDTO(IdolGroupDTO searchedIdolGroupDTO) {
		// TODO Auto-generated method stub
		System.out.println("검색된 아이돌 그룹 정보");
		System.out.println(searchedIdolGroupDTO);
	}

	public void printSearchedIdolGroupDTOArray(IdolGroupDTO[] searchedIdolGroupDTOArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < searchedIdolGroupDTOArray.length; i++) {
			System.out.println(searchedIdolGroupDTOArray[i]);
		}
	}

	public void printIdolGroupList(ArrayList<IdolGroupDTO> idolGroupList) {
		// TODO Auto-generated method stub
		if(idolGroupList == null) {
			System.out.println("등록된 아이돌 그룹이 없습니다.");
		}
		else {
			for (int i = 0; i < idolGroupList.size(); i++) {
				System.out.println(idolGroupList.get(i));
			}
		}
	}

	public void printSearchedIdolGroupList(ArrayList<IdolGroupDTO> searchedIdolGroupList) {
		// TODO Auto-generated method stub
		if(searchedIdolGroupList == null || searchedIdolGroupList.size() == 0) {
			System.out.println("검색된 아이돌 그룹 정보가 없습니다.");
		}
		else {
			for (int i = 0; i < searchedIdolGroupList.size(); i++) {
				System.out.println(searchedIdolGroupList.get(i));
			}
		}
	}
}











