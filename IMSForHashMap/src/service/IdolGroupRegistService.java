package service;

import java.util.ArrayList;
import java.util.HashMap;

import ui.IdolGroupUI;

public class IdolGroupRegistService {

    public boolean registIdolGroup(HashMap<String, String> newIdolGroupHashMap) {
        
    	boolean registSuccess = true;
    	
    	// 같은 이름 등록은 불가능해야 함
    	// regist 가 불가능 할 경우 registSucess를 false로 바꿔 등록 실패로 만든다
        for (int i = 0; i < IdolGroupUI.idolGroupList.size(); i++) {
			if(IdolGroupUI.idolGroupList.get(i).get("idolGroupName")
					.equals(newIdolGroupHashMap.get("idolGroupName"))) {
				registSuccess = false;
				break;
			}
		}
        
        // registSuccess가 true라는 것은 등록에 성공한다는 뜻으로 list에 넣는다
        if(registSuccess) {
        	IdolGroupUI.idolGroupList.add(newIdolGroupHashMap);
        }
        
        return registSuccess;
    }
}

