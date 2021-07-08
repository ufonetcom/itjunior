package com.spring.itjunior.mapper;

import com.spring.itjunior.domain.RecruitDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecruitMapper {

    /** 사람인api로 호출된 채용기업정보 리스트 페이지에서 하나의 기업의 좋아요 또는 스크랩 버튼을 누를 시 DB에 기업정보를 추가한다.*/
    public int insertRecruit(RecruitDTO recruitDTO);


}