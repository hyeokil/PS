# [Silver III] 한번 쏘면 멈출 수 없어 - 3991 

[문제 링크](https://www.acmicpc.net/problem/3991) 

### 성능 요약

메모리: 11680 KB, 시간: 68 ms

### 분류

해 구성하기, 구현

### 제출 일자

2024년 8월 23일 15:26:06

### 문제 설명

<p>은기는 모바일 게임 개발자이다. 이번에 은기가 만드는 게임은 Chain Shot! 게임 (SameGame, Jawbreaker, Bubble Shot, ... 으로도 알려져 있다)을 응용한 "한번 쏘면 멈출 수 없어" 이다.</p>

<p>게임은 직사각형 게임판에서 진행되며, 각 칸에는 색칠된 구슬이 채워져 있다. 플레이어는 각 턴마다 같은 색으로 이루어진 인접한 구슬 그룹을 선택한다. 선택한 구슬은 모두 게임판에서 제거된다. 구슬이 떠있는 경우에는 모두 바닥으로 떨어지게 되고, 빈 열은 제거된다.</p>

<table class="table table-bordered td-center th-center" style="width:100%;">
	<tbody>
		<tr>
			<td><img alt="" src="https://upload.acmicpc.net/0de1c91f-73ee-4267-abe3-92ac506ccd84/-/crop/290x202/0,0/-/preview/" style="width: 145px; height: 101px;"></td>
			<td><img alt="" src="https://upload.acmicpc.net/0de1c91f-73ee-4267-abe3-92ac506ccd84/-/crop/289x202/318,0/-/preview/" style="width: 145px; height: 101px;"></td>
			<td><img alt="" src="https://upload.acmicpc.net/0de1c91f-73ee-4267-abe3-92ac506ccd84/-/crop/291x202/634,0/-/preview/" style="width: 146px; height: 101px;"></td>
			<td><img alt="" src="https://upload.acmicpc.net/0de1c91f-73ee-4267-abe3-92ac506ccd84/-/crop/246x202/946,0/-/preview/" style="width: 123px; height: 101px;"></td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<th>선택한 그룹</th>
			<th>바닥으로 떨어지는 구슬</th>
			<th>빈 열</th>
			<th>최종 상태</th>
		</tr>
	</tfoot>
</table>

<p>각 턴마다 플레이어가 얻는 점수는 그룹을 구성하는 구슬 개수의 제곱이다. 예를 들어, 위의 그림에서 플레이어는 49점을 받게 된다.</p>

<p>게임판에 구슬이 모두 없어지면 게임은 끝나게 되고, 플레이어의 점수는 각 턴마다 얻은 점수의 합이 된다.</p>

<p>레벨의 설계도는 게임판의 크기와 각 구슬 색상의 수로 이루어져 있다.</p>

<p>레벨의 설계도가 주어졌을 때, 설계도로 만들 수 있는 레벨 중 얻을 수 있는 점수가 가장 높은 것을 구하는 프로그램을 작성하시오. </p>

### 입력 

 <p>입력으로 레벨의 설계도가 주어진다.</p>

<p>첫째 줄에는 게임판의 행의 수 h와 열의 수 w, 색상의 수 c가 주어진다. (1 ≤ h, w ≤ 10, 1 ≤ c ≤ 9)</p>

<p>둘째 줄에는 c개의 양의 정수가 주어지며, 각 정수는 그 색상 구슬의 개수이다. 구슬 개수의 합은 h·w가 된다.</p>

### 출력 

 <p>만든 게임판을 출력한다. 첫 번째 색상은 1, 두 번째 색상은 2, ... 로 출력한다.</p>

