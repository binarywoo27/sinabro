import React from "react";
import styled from "styled-components";
import { Link } from "react-router-dom";

const LectureDiv = styled.div`
  width: 100%;
  border: none;
  border-radius: 10px;
  box-shadow: -1px 15px 30px -12px black;
  margin-bottom: 50px;
`;

const StyledImg = styled.img`
  width: 100%;
  border-radius: 10px 10px 0px 0px;
  margin-bottom: 5px;
`;

const StyledBtn = styled.button`
  margin-top: 20px;
  width: 100%;
  height: 80px;
  border: none;
  border-radius: 0px 0px 10px 10px;
  background-color: #f7c815;
  font-size: larger;
  font-weight: 1000;
  color: black;
`;

const StyledLink = styled(Link)`
  text-decoration: none;
  color: black;
`;

function LectureItemCard({
  no,
  subject,
  startDate,
  endDate,
  content,
  savedName,
}) {
  // 강의 신청 여부 판단해줄 state 만들기
  // const [isRegist, setIsRegist] = useState()

  //   // 강의신청 버튼 클릭 시 신청 요청 보내는 axios!
  // const registLecture = async() => {
  //   try {
  //     const regist = await axios.get("/normal/lecture/" +no )
  //   } catch(e) {
  //     console.log(e)
  //   }
  // }

  //   const getSearchData = async () => {
  //     try {
  //       const lecture = await axios.get("/main/search/" + search);
  //       dispatch(changeLecture(lecture.data));
  //     } catch (e) {
  //       console.log(e);
  //     }
  //   };

  return (
    <div>
      <LectureDiv>
        <StyledLink to={`/detail/${no}`}>
          <StyledImg src={savedName} alt="img" />
          <h2>{subject}</h2>
          <p>{content}</p>
          <p>
            {startDate.slice(0, 10)} ~ {endDate.slice(0, 10)}
          </p>
        </StyledLink>
        <StyledBtn>강의신청</StyledBtn>
      </LectureDiv>
    </div>
  );
}

export default LectureItemCard;
