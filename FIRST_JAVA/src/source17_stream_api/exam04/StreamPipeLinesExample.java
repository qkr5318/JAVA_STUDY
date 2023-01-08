package source17_stream_api.exam04;

import java.util.Arrays;
import java.util.List;

// 회원들 중에서 여성 회원들의 나이 평균을 구하는 자바 프로그램 제작해 봅니다.
public class StreamPipeLinesExample {
	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(new Member("장나라", Member.FEMALE, 30), new Member("김희선", Member.FEMALE, 45), new Member("김국진", Member.MALE, 43), new Member("김다미", Member.FEMALE, 30));
		
		double ageAvg = list.stream() // 스트림 생성
				// 중간처리(중간연산): filter() 메서드 활용 Member.FEMALE 데이터 추출 처리
				.filter(m -> m.getGender() == Member.FEMALE)
				// 중간처리(중간연산) : mapToInt(Member::getAge) 데이터 매핑 처리
				.mapToInt(Member::getAge)
				// 집계처리(최종연산) : average().getAsDouble() 메서드로 FEMALE 평균 나이 산출
				.average()
				.getAsDouble();
		System.out.println("여성 회원들의 평균 나이 = " + ageAvg);
	}
}

