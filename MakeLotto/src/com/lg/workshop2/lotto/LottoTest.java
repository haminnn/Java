package com.lg.workshop2.lotto;

public class LottoTest {

	public static void main(String[] args) {
		Lotto lo = new Lotto();
		int[] lottoNumbers = lo.generateLottoNumbers();
		lo.displayLottoNumbers(lottoNumbers);

}
}