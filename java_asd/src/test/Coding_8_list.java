package test;

public class Coding_8_list {

static	String list[] = {"김도윤","김민형","김태완","유규종"};
static	String num[] = {"010-xxxx-xxxx","010-oooo-oooo","010-vvvv-vvvv","010-ssss-ssss"};
	
	void list() {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]+" : "+num[i]);
		}
	}
	
}
