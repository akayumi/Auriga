//====================================================================
//Ragnarok Online Wizard jobchange script
//
//�@�� CHANGE_WZ    -> 0�`12
//     $@wz_tester$ -> ���Z����҂̃L������
//====================================================================

//==========================================
// �����\���E�ꎟ�����i���W�j�E�]�E
//------------------------------------------

gef_tower.gat,111,37,4	script	�M���h�֌W��	70,{
	if(Upper == UPPER_HIGH) {
		mes "[�J�g���[�k]";
		mes "����H";
		mes "����ȏ��܂ŉ������p������H";
		next;
		mes "[�J�g���[�k]";
		mes "�Ȃ񂾂����ʂ���Ȃ��C�z��";
		mes "�����Ă����ˁB";
		mes "���̒��q�Ŋ撣���ĂˁB";
		close;
	}
	if(Job == Job_Wizard) {
		mes "[�J�g���[�k]";
		mes "�����E�B�U�[�h�ł��邠�Ȃ��ɂ�";
		mes "������ւ̗p�͖����͂��B";
		next;
		mes "[�J�g���[�k]";
		if(Sex == 0) {	//������
			mes "�{�[�C�t�����h�ł��o������";
			mes "�A��Ă��ĂˁB�t�t�b";
		}
		else
			mes "�f�[�g�̐\�����݂Ȃ���������ǁB";
		close;
	}
	if(Job != Job_Magician) {
		mes "[���p�t�M���h�֌W��]";
		mes "����A����ȍ����Ƃ���܂ŉ��̗p�H";
		mes "���ɗp��������΍~��Ă��������ˁB";
		mes "�����̓E�B�U�[�h�̂��߂̏ꏊ��B";
		next;
		mes "[���p�t�M���h�֌W��]";
		mes "���A�C�����č~��ĂˁB";
		close;
	}
	switch(CHANGE_WZ) {
	case 0:
		mes "[���p�t�M���h�֌W��]";
		mes "����A����ȍ����Ƃ���܂ŏ����";
		mes "����Ȃ�āB���̗p���ŗ����́H";
		next;
		if(select("�E�B�U�[�h�ɓ]�E���ɗ��܂���","�c�Ȃ�ł��Ȃ��ł�")==2) {
			mes "[���p�t�M���h�֌W��]";
			mes "��c";
			mes "���ɗp���Ȃ����";
			mes "�~��Ă��������`�B";
			close;
		}
		mes "[���p�t�M���h�֌W��]";
		mes "�����ˁA����ȊO�̗��R��";
		mes "����ȍ����Ƃ���܂ŏ���Ă��Ȃ�";
		mes "���ˁB�Ƃɂ����悭���܂����B";
		mes "�����]�E�̂���`�������܂��B";
		next;
		mes "[���p�t�M���h�֌W��]";
		mes "���̖��O�̓J�g���[�k=���f�B�b�`�B";
		mes "�����]�E���Ă��炻��ȂɌo���ĂȂ�";
		mes "�E�B�U�[�h��B�C�y�Ɂu�J�g���[�k�v��";
		mes "�Ă�ł���Ă�����B�ӂӁc";
		next;
		mes "[�J�g���[�k]";
		mes "�E�B�U�[�h�ɂȂ肽����l�͑�������";
		mes "�E������l�������c";
		mes "�E�B�U�[�h�ɂȂ�̂͑�ςȂ��ƂȂ́B";
		next;
		mes "[�J�g���[�k]";
		mes "�܂��A�]�E����ɂ�Job���x��40";
		mes "�͍Œ�K�v�B";
		mes "�����łȂ��ƁA�E�B�U�[�h�ɂȂ邾����";
		mes "���@�͂�������ĂȂ�����B";
		next;
		mes "[�J�g���[�k]";
		mes "�ڂ��������́A�]�E�\�����݂�";
		mes "������ɂ����B";
		mes "�ǂ��H�������\���������H";
		next;
		if(select("�͂��A���˂������܂�","����������ƍl���Ă݂܂�")==2) {
			mes "[�J�g���[�k]";
			mes "�킩��܂����B�������l���Ȃ����B";
			mes "�]�E�\�����݂́A���ł�";
			mes "�󂯕t���Ă��邩��B";
			close;
		}
		if(JobLevel < 40) {
			mes "[�J�g���[�k]";
			mes "�ق�A�����������������̂�";
			mes "�v���o���āBJob���x����40�ȏ�";
			mes "����Ȃ��Ɠ]�E�ł��Ȃ����B";
			next;
			mes "[���p�t�M���h�֌W��]";
			mes "�ł�Ȃ��ŁA���������׋����Ă��āB";
			mes "�]�E�����𖞂�������󂯂�����";
			mes "�����܂��B";
			close;
		}
		if(SkillPoint) {	//������
			mes "[�J�g���[�k]";
			mes "���炠��A�X�L���|�C���g��";
			mes "�]���Ă���݂����ˁB";
			mes "�X�L���|�C���g���g���؂��Ă���";
			mes "���Ă��������ˁB";
			close;
		}
		mes "[�J�g���[�k]";
		mes "�͂��A����ł͓]�E�\�����݂�";
		mes "�󂯕t���܂��B";
		mes "���O�� " +strcharinfo(0)+ " �ˁB";
		next;
		mes "[�J�g���[�k]";
		mes "�E�B�U�[�h�]�E������";
		mes "�O�ɕ�����Ă��āA";
		mes "��߂͖��@�A�C�e���W�߁B";
		mes "��߂͕M�L����";
		mes "�O�߂͖��@���Z�����B";
		next;
		mes "[�J�g���[�k]";
		mes "���̒��̈�Ԗڂ̎����́A";
		mes "Job���x��50�̐l�͖Ə��ɂȂ��B";
		mes "�����\���ɓw�͂��Ă邩��B";
		next;
		if(JobLevel >= 50) {
			mes "[�J�g���[�k]";
			mes "����A���Ȃ�Job���x��50";
			mes "�ɂȂ��Ă܂��ˁB";
			mes "����ۂǊ撣������ł��ˁB";
			mes "�f�G�ȃE�B�U�[�h�ɂȂ�ł��傤�B";
			next;
			mes "[�J�g���[�k]";
			mes "����ł͈�߂̎�����";
			mes "�Ə��ɂ��܂��傤�B";
			mes "�ł��A�܂���̎�����";
			mes "�c���Ă邩����S���Ȃ��łˁB";
			next;
			mes "[�J�g���[�k]";
			mes "���Ⴀ�A���̋��ɂ���l��";
			mes "�b�������Ă݂Ă��������B";
			mes "���Ȃ����Ǝv������";
			mes "�C�����ĂˁB";
			set CHANGE_WZ,3;
			close;
		}
		mes "[�J�g���[�k]";
		mes "����ł́A�\�����݂����������̂�";
		mes "��߂̎����Ɉڂ�܂��傤���B";
		next;
		mes "[�J�g���[�k]";
		mes "���@�A�C�e�����W�߂Ă���̂�";
		mes "��ڂ̎����ł��B";
		mes "�厖�Ȃ̂́A�����̗͂ŏW�߂�";
		mes "����Ƃ������Ƃł��B";
		next;
		mes "[�J�g���[�k]";
		mes "���Ȃ����W�߂Ă���A�C�e���́A";
		if(rand(2)) {	//�䎌������
			set CHANGE_WZ,1;
			mes "^3051FD�C�G���[�W�F���X�g�[��^000000 10��,";
			mes "^3051FD���b�h�W�F���X�g�[��^000000 10��,";
			mes "^3051FD�u���[�W�F���X�g�[��^000000 10��,";
		}
		else {
			set CHANGE_WZ,2;
			mes "^3051FD�N���X�^���u���[^000000 5��,";
			mes "^3051FD�C�G���[���C�u^000000 5��,";
			mes "^3051FD���b�h�u���b�h^000000 5��,";
			mes "^3051FD�E�B���h�I�u���F���f���[��^000000 5��,";
		}
		mes "������Ԃ������邯��";
		mes "�Ȃ�Ƃ��Ȃ�ł��傤�B";
		next;
		mes "[�J�g���[�k]";
		mes "����ł͂����Ă�����Ⴂ�`�B";
		mes "�������҂��Ă܂��B";
		close;
	case 1:
	case 2:
		mes "[�J�g���[�k]";
		mes "�͂��A�A�C�e���͏W�߂Ă��܂������H";
		mes "����ł͂����ƏW�߂�ꂽ��";
		mes "���Ă݂܂��傤���B";
		next;
		if(CHANGE_WZ == 1) {
			setarray '@need,715,716,717;
			set '@amount,10;
		}
		else {
			setarray '@need,990,991,992,993;
			set '@amount,5;
		}
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {	//�K�v�A�C�e���̃`�F�b�N
			if(countitem('@need['@i]) < '@amount)
				break;
		}
		if('@i < getarraysize('@need)) {
			mes "[�J�g���[�k]";
			mes "��H�S�������Ă��Ȃ���B";
			next;
			mes "[�J�g���[�k]";
			mes "������������Ă��đ�ς��������ǁA";
			mes "������x�����Ă�����Ⴂ�B";
			mes "���x�͂�������W�߂Ă��ĂˁB";
			next;
			mes "[�J�g���[�k]";
			for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1)
				mes "^3051FD" +getitemname('@need['@i])+ "^000000 " +'@amount+ "��,";
			mes "�悭�o���Ă�������W�߂Ă��ĂˁB";
			close;
		}
		mes "[�J�g���[�k]";
		mes "���A���m�ł��ˁI";
		mes "�悭�W�߂Ă��܂����B";
		mes "�����̃A�C�e���́A�M���h��";
		mes "�L���Ɏg�킹�Ă��������܂��ˁB";
		next;
		set CHANGE_WZ,3;
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1)
			delitem '@need['@i],'@amount;
		mes "[�J�g���[�k]";
		mes "�͂��A��߂̎����͍��i�ł��B";
		mes "�ł��A�܂���̎�����";
		mes "�c���Ă邩����S���Ȃ��łˁB";
		next;
		mes "[�J�g���[�k]";
		mes "���Ⴀ�A���̋��ɂ���l��";
		mes "�b�������Ă݂Ă��������B";
		mes "���Ȃ����Ǝv������";
		mes "�C�����ĂˁB";
		close;
	case 3:
	case 4:
		mes "[�J�g���[�k]";
		mes "��H�ǂ������́H";
		mes "��߂̎����͏I���������";
		mes "���̋��ɂ���l�̂Ƃ����";
		mes "�s���Ȃ����B";
		next;
		mes "[�J�g���[�k]";
		mes "��߂̎������󂯂Ȃ����";
		mes "�Ȃ�Ȃ�����B";
		mes "�҂��Ă���ł��傤���瑁���s����";
		mes "�����āB";
		close;
	case 5:
		mes "[�J�g���[�k]";
		mes "�ӂӁA�����Ă������B";
		mes "���������̂ɋ�J������ˁB";
		mes "�������蕨�ł����Ă����������ǁA";
		mes "�Ō�̎������c���Ă����ˁB";
		next;
		mes "[�J�g���[�k]";
		mes "���������ł��Ȃ����E�B�U�[�h��";
		mes "�Ȃ�邩��A���蕨�͂��̎���";
		mes "���܂��傤�B";
		next;
		mes "[�J�g���[�k]";
		mes "����ł͍s���Ă�����Ⴂ�B";
		mes "���̐l���҂��Ă��B";
		close;
	default:	//6�`11�̂Ƃ�
		mes "[�J�g���[�k]";
		mes "���炠��A�����𔲂��o���Ă��Ă�";
		mes "���߂���Ȃ��́B";
		next;
		if(Sex == 0) {
			mes "[�J�g���[�k]";
			mes "���̎q���ア�ӂ���������Ă��߁B";
			mes "���Ȃ������ăE�B�U�[�h�ɂȂ邽�߂�";
			mes "�����܂ŗ�����ł��傤�H";
			next;
			mes "[�J�g���[�k]";
			mes "�������ē����������";
			mes "���߂Ȃ������񂾂���B";
			mes "����𐶂��Ă�������Ȃ�A";
			mes "���ꂭ�炢�̎����Ȃ�";
			mes "���Ȃ��Ȃ����Ⴞ�߁B";
		}
		else {
			mes "�}�W�V����������Ƃ����āA�j��";
			mes "��C�ɂȂ����Ⴞ�߁B";
		}
		mes "[�J�g���[�k]";
		mes "����ł́A���C���o���čs���Ȃ����B";
		mes "���̐l���҂��Ă��B";
		close;
	case 12:
		mes "[�J�g���[�k]";
		mes "�S�Ă̎����ɍ��i�A";
		mes "���߂łƂ��������܂��I";
		next;
		mes "[�J�g���[�k]";
		mes "�����A�������Ă�ꍇ����Ȃ���B";
		mes "�����ɓ]�E�����Ă����Ȃ���΁B";
		next;
		unequip;
		jobchange Job_Wizard;
		set CHANGE_WZ,0;
		mes "[�J�g���[�k]";
		mes "�������Ȃ����E�B�U�[�h�B";
		mes "���X���X�Ƃ��āA���������";
		mes "�����Ă����Ȃ���΂Ȃ�Ȃ���B";
		mes "���B�E�B�U�[�h�͂ƂĂ����͂�";
		mes "���@���g���邩��A���̕�";
		mes "�s���͍T���ڂɂ��Ȃ��Ⴞ�߂�B";
		next;
		mes "[�J�g���[�k]";
		mes "�X�ł�������ɖ��@���g������A";
		mes "�l�̎ז��������肷��̂͌��ցB";
		mes "�E�B�U�[�h�̖��@���Ă����̂�";
		mes "�����X�^�[�Ƃ̐킢�Ő^���𔭊�";
		mes "������̂�����ˁB";
		next;
		mes "[�J�g���[�k]";
		mes "���̐l�ƃp�[�e�B�[��g��ŁA";
		mes "�ނ�̏����ɂȂ��Ă����ĂˁB";
		mes "���c���ƁA���Ȃ��Ƀv���[���g��";
		mes "����܂��B������Ƒ҂��Ăˁc";
		next;
		mes "[�J�g���[�k]";
		mes "���������c";
		mes "���������c";
		next;
		getitem 505,6;
		mes "[�J�g���[�k]";
		mes "�K�v�Ȏ��A�L���Ɏg���Ă��ꂽ���";
		mes "�v����B";
		mes "�����������񂾂���A���炸��";
		mes "�����Ŏg���Ă��傤�����ˁB";
		next;
		mes "[�J�g���[�k]";
		mes "�����A�E�B�U�[�h�Ƃ��đf�G��";
		mes "��炵�Ă��������ˁB";
		close;
	}
}

//==============================================================
gef_tower.gat,107,36,4	script	�����т̌�	81,{
	if(Job == Job_Wizard) {
		mes "[�}���A]";
		mes "�����ɋ�����O�ɏo�āA�N��";
		mes "�ǂꂭ�炢�����Ȃ�����������";
		mes "�݂Ă͂������H";
		next;
		mes "[�}���A]";
		mes "�������A���������������̂�";
		mes "���B�E�B�U�[�h���Ƃ������Ƃ�";
		mes "�Y�ꂸ�ɁB";
		close;
	}
	if(Job != Job_Magician) {
		mes "[��]";
		mes "�ӂ�c���@���g�����Ƃ��ł��Ȃ�";
		mes "�l�������ɗ����̂�H";
		mes "�ɂȂ�Q�t�F�����̉��ŉ^���ł�";
		mes "���Ă��Ȃ����`�B";
		next;
		mes "[��]";
		mes "�����~��Ȃ����I";
		mes "���񂽂Ƙb���Ă���ɂ͂Ȃ��́I";
		close;
	}
	switch(CHANGE_WZ) {
	case 0:
		mes "[��]";
		mes "���A���̘b�����������킩���B";
		mes "�E�B�U�[�h�ɓ]�E��������ł��傤�H";
		next;
		mes "[��]";
		mes "�]�E�������Ȃ�A���̃J�g���[�k��";
		mes "���k���Ă݂āB";
		mes "�ޏ��Ȃ�悭��`���Ă����ł��傤�B";
		next;
		mes "[��]";
		mes "�]�E�����̉ߒ��ł킩��Ȃ����Ƃ�";
		mes "�������玄�ɂ������āB";
		mes "���������Ă����m��Ȃ񂾂���B";
		next;
		if(select("�c�c","���������Ă�c")==1) {
			mes "[��]";
			mes "��H���c���̊Ԃ́c";
			mes "���������Ă�̂�����̂�";
			mes "���߂āH";
			next;
			mes "[��]";
			mes "�ӂށc��������Ƃ����";
			mes "����������������̂ł͂Ȃ���ˁB";
			mes "�ӂނӂށc";
			mes "�c�c";
		}
		else {
			mes "[��]";
			mes "����ȘI���Ɍ���Ȃ��Ă�";
			mes "��������Ȃ��I";
			mes "�ǂ����Ă����Ȃ������̖���m��Ȃ�";
			mes "�����Ɂc";
		}
		next;
		mes "[��]";
		mes "���̖��O��";
		mes "�u�}���A=�X�v��=���h�v�X�J�v";
		mes "���̂܂܁u�}���A�v�ƌĂ��";
		mes "�����΂����B";
		mes "�����ł��񂽂̂悤�ȃE�B�U�[�h";
		mes "�]�E��]�҂̎�`�������Ă���̂�B";
		next;
		mes "[�}���A]";
		mes "�������ɂȂ������R�́c";
		mes "�������̎��������Ă���Ƃ��ɁA";
		mes "�{�[�C�t�����h�̃~�X�ł����Ȃ���";
		mes "���܂����́c�B";
		next;
		mes "[�}���A]";
		mes "���_��ł͐�������ɂ͖�̌����ڂ�";
		mes "�؂��͂��Ȃ񂾂��ǁc";
		next;
		mes "[�}���A]";
		mes "�܂�������c";
		mes "�������󂯂�Ȃ珕���ɂȂ��B";
		next;
		mes "[�}���A]";
		mes "�]�E�ɂ��Ă͂��������������ʂ�A";
		mes "�܂��J�g���[�k�ɘb�𕷂��Ȃ����B";
		mes "�ޏ����E�B�U�[�h�ɂȂ��Ă���";
		mes "�����󂢂̂�c�t�t�B";
		next;
		mes "[�}���A]";
		mes "�]�E�����̉ߒ��ɂ���";
		mes "�ڂ��������ł��邯�ǁc";
		mes "�ǂ��H������������Ă����悤���H";
		next;
		switch (select("�͂��I���������肢���܂�","�������A���v�ł�","�������̂�b���̂ˁc")) {
			case 1:
				mes "[�}���A]";
				mes "��B���񂽂ɂ͓��ʂɏڂ���";
				mes "�����Ă������B";
				next;
				mes "[�}���A]";
				mes "�E�B�U�[�h�֓]�E����ɂ͎O��";
				mes "������ʉ߂��Ȃ���΂Ȃ�Ȃ��́B";
				mes "�ŏ��ɁA���@�A�C�e�����W�߂Ă���";
				mes "�����������B";
				next;
				mes "[�}���A]";
				mes "����́A�J�g���[�k�Ɏ����\������";
				mes "�񎦂����炷���n�܂��B";
				mes "�e�W�F���X�g�[���⑮�����΂�";
				mes "�W�߂�̂�B";
				next;
				mes "[�}���A]";
				mes "��ڂ͖��@�N�C�Y�B";
				mes "�������̋������ɂ��郉�E����";
				mes "�Ƃ����A�C�Ȑl���S�����Ă�B";
				next;
				mes "[�}���A]";
				mes "���@�Ɋւ������A�����X�^�[��";
				mes "�ւ�����A�܂��̓}�W�V�����Ɋւ���";
				mes "��肾�����͂���B";
				mes "10��������o���̂ɁA�S������";
				mes "���Ȃ��Ƃǂ�ǂ񗎑悳���Ă���";
				mes "�炵����c�B";
				next;
				mes "[�}���A]";
				mes "�ނ����̂܂܎O�ڂ̎�����";
				mes "�ē����Ă�����B";
				mes "�O�ڂ̎����́A�����X�^�[�B��";
				mes "�|��������B";
				next;
				mes "[�}���A]";
				mes "�e�����ɓ���ƁA���ꂼ��̕�����";
				mes "�����Ɠ��������̃����X�^�[���o��";
				mes "���邩��A�����ʓI�Ȗ��@����g����";
				mes "�i�ނ��Ƃ��厖�ˁB";
				next;
				mes "[�}���A]";
				mes "���̐����͂��ꂭ�炢�B";
				mes "������莩���ő̌������ق���";
				mes "�ǂ�����ˁB";
				close;
			case 2:
				mes "[�}���A]";
				mes "�����A���ꂶ��\�����݂�����";
				mes "�撣���Ă�������Ⴂ�B";
				close;
			case 3:
				mes "[�}���A]";
				mes "���ň����������!!";
				next;
				mes "[�}���A]";
				mes "�����A�ǂ����s�����Ⴆ!!";
				close2;
				warp "gef_dun00.gat",116,102;
				end;
		}
	case 1:
	case 2:
		mes "[�}���A]";
		mes "�����Ƃ���ǂ����Ă������킩��Ȃ�";
		mes "���Ă�����ˁB";
		mes "�]�E�����̐\�����݂͍ς܂��āA";
		mes "�A�C�e�����W�߂Ă���悤��";
		mes "�����Ă���ł���H";
		next;
		mes "[�}���A]";
		mes "�ꉞ���������������A�����̗͂�";
		mes "�Ȃ�Ƃ����Ȃ��Ƃ��߁B";
		next;
		mes "[�}���A]";
		mes "�������Ƃ���ɂ��Ƒ������΂�";
		mes "�W�߂Ă���̂�ˁB";
		mes "�W�߂�͎̂�`���Ȃ����ǁA";
		mes "�������炢�͂��Ă��������B";
		next;
		mes "[�}���A]";
		mes "�N���X�^���u���[�́A�o�C��������";
		mes "�s���Ă݂Ȃ����B";
		mes "�J�i�g�E�X�A�N�N���A�}���i�A�o�h���c";
		mes "���̂ւ�̃����X�^�[����";
		mes "��ɓ���₷���ł��傤�B";
		next;
		mes "[�}���A]";
		mes "�C�G���[���C�u�́A�����^�����X�^�[";
		mes "�炩���ɓ����B";
		mes "�z������}���e�B�X�A�r�^�^�Ƃ�����";
		mes "�����X�^�[��|���Ă݂āB";
		next;
		mes "[�}���A]";
		mes "���b�h�u���b�h�̓G���_�[�E�B���[����";
		mes "��������o��ƌ����ǁA�����ɍs����";
		mes "���^������X�R�[�s�I����|���Ă݂�";
		mes "�̂����������ˁB";
		next;
		mes "[�}���A]";
		mes "�E�B���h�I�u���F���f���[����";
		mes "�z�[�l�b�g�A�X�^�C�i�[�A";
		mes "�X�e�B�[���`�����`���������肩�ȁB";
		mes "�����撣��Ύ�ɓ����B";
		next;
		mes "[�}���A]";
		mes "���ꂶ��撣���Ă݂āB";
		mes "�E�B�U�[�h�ɂȂ邽�߂ɂ�";
		mes "���ꂭ�炢��{������B";
		close;
	case 3:
	case 4:
		mes "[�}���A]";
		mes "��ڂ̎������I����Ĉ��S���Ă���";
		mes "�悤�ˁc�ł��I";
		mes "�܂������͓�c���Ă��邩��C��";
		mes "�������Ⴞ�߂�I";
		close;
	case 5:
		mes "[�}���A]";
		mes "����A�悭�����ė�����ˁB";
		next;
		mes "[�}���A]";
		mes "����ł͍Ō�̎����܂ŋC�𔲂�����";
		mes "�撣���Ă�������Ⴂ�B";
		mes "���E�������҂��Ă��B";
		close;
	default:	//6�`11�̂Ƃ�
		mes "[�}���A]";
		mes "�ʖڂˁc������߂ċA���ė����́H";
		mes "�܂����������c����Ȃ��Ƃł�";
		mes "�ǂ��E�B�U�[�h�ɂȂ�Ȃ����I";
		next;
		mes "[�}���A]";
		mes "�e�����ɂ́A���̕����Ɠ���������";
		mes "�����X�^�[���o��̂͂킩������ˁH";
		mes "���@�������l�ԂȂ�A�ǂ̑���������";
		mes "�����X�^�[�Ɍ��ʓI�Ȃ̂�����������";
		mes "�������Ă��Ȃ���΂Ȃ�Ȃ���B";
		next;
		mes "[�}���A]";
		mes "�X�L�����g�������X�^�[�ւ̑Ώ���";
		mes "�ł��Ă��Ȃ���΂Ȃ�Ȃ�����A";
		mes "�X�L���Ŏ���ł��܂��l�́A�����";
		mes "�H�炤�O�ɓ|���Ă��܂�Ȃ����";
		mes "�Ȃ�Ȃ��B";
		next;
		mes "[�}���A]";
		mes "�Ƃɂ����߂��Ă�����x���킵��";
		mes "��������Ⴂ�B����ȂƂ���ŉ���";
		mes "�����Ă��Ă͂��߁B";
		close;
	case 12:
		mes "[�}���A]";
		mes "����ς���Ƃ�����ˁI";
		mes "���ꂩ��̓E�B�U�[�h���ČĂ�ł�";
		mes "���F�͖����ł��傤�ˁB";
		next;
		mes "[�}���A]";
		mes "���߂łƂ��B���ꂩ����撣��̂�B";
		close;
	}
}


//==========================================
// �񎟎����i�M�L�j
//------------------------------------------

gef_tower.gat,102,24,8	script	�A�C�ȃE�B�U�[�h	735,{

	function Routine {
		mes "[���E����]";
		mes "�^�ʖڂȂ���c�B";
		mes "�ǂ�c������������Ă�낤�B";
		mes "��������������Ǝv���Ă��A";
		mes "����ꂽ�Ƃ���ɂ���Α����ȒP��";
		mes "�I���邱�Ƃ��ł��邾�낤�B";
		next;
		mes "[���E����]";
		mes "�����͐퓬�����Ȃ��Ă��邱�Ƃ��B";
		mes "���̕����A�n�̕����A�΂̕�����";
		mes "���ɐi�݁A�e�����ɂ͂��ꂼ���";
		mes "�����̑����������������X�^�[��";
		mes "�o������B";
		next;
		mes "[���E����]";
		mes "�ǂ�ȃ����X�^�[���o�Ă��邩��";
		mes "����΂킩��B";
		mes "�����ł́A�e�����Ɍ��ʓI�ȑ�����";
		mes "�΍R���邱�Ƃɂ���āA���ȒP��";
		mes "�����邱�Ƃ��ł��邾�낤�c";
		next;
		mes "[���E����]";
		mes "�������ԓ��ɁA�o�����������X�^�[��";
		mes "�S���|���A����ɗ����ӂ�����Q�[�g";
		mes "�����X�^�[��|���Ύ��̕�����";
		mes "�ړ��ł���B";
		next;
		mes "[���E����]";
		mes "�����Ď��̂Ƃ���ɖ߂�΁A";
		mes "�]�E�����͏I���ƂȂ�B�����";
		mes "�E�B�U�[�h�ɂȂ��Ƃ����킯���B";
		return;
	}

	if(Job == Job_Novice) {
		mes "[���E����]";
		mes "�Ђ�������Ȃ�����ȏꏊ�ɗ����H";
		mes "�����ɗ�������Ȃ����B";
		close2;
		warp "geffen.gat",120,110;
		end;
	}
	if(Job == Job_Priest) {
		mes "[���E����]";
		mes "�A��񂾁B�_�̎d���ɗp�͂Ȃ��B";
		mes "���͂Ɛ_�͂͑��e��Ȃ�����ȁB";
		next;
		mes "[���E����]";
		mes "����łȂ��Ƃ����̑̒��͂悭�Ȃ��c";
		mes "�߂Â���������֍s���Ȃ����B";
		close;
	}
	if(Job == Job_Wizard) {
		mes "[���E����]";
		mes "�c���ɉ��̗p���H";
		mes "���O�����@���g���҂Ȃ疂�@�ɂ���";
		mes "�悭�m���Ă��Ȃ���΂Ȃ�Ȃ��B";
		next;
		mes "[���E����]";
		mes "���@��s�^�ʖڂɈ����Ă����";
		mes "���͂Ȗ��@���g�������A������";
		mes "���@�𐧌�ł��Ȃ��Ȃ邾�낤�c�B";
		mes "�����Ȃ肽���Ȃ���΁A���@�ɂ���";
		mes "�[���������Ă����ׂ����B";
		next;
		mes "[���E����]";
		mes "�c��̐l�����A�p�l�Ƃ���";
		mes "�I��点�����Ȃ���΂ȁc�B";
		close;
	}
	if(Job != Job_Magician) {
		mes "[���E����]";
		mes "�����c�ꂵ���c�B";
		mes "�S�g���܂�ŗ₽���X��";
		mes "�Z�����Ă���悤�Ȋ������c�B";
		next;
		mes "[���E����]";
		mes "�������O�́c";
		mes "�������ɍs���Ă���Ȃ����c�B";
		close;
	}
	switch(CHANGE_WZ) {
	case 0:
		mes "[���E����]";
		mes "�c�����������̂��킩��Ȃ���";
		mes "���͂��O�ɕt�������Ă���ɂ͖����B";
		next;
		mes "[���E����]";
		mes "�������֍s���Ȃ����B";
		close;
	case 1:
	case 2:
		mes "[���E����]";
		mes "�N�N�N�c";
		mes "�E�B�U�[�h�ɂȂ肽���Ƃ����z���B";
		next;
		mes "[���E����]";
		mes "���̂܂܂ł���ƁA�������т���";
		mes "�Ƃ����ł��Ȃ����낤�B";
		next;
		mes "[���E����]";
		mes "�E�B�U�[�h�̑f���炵����";
		mes "��Ŏv���m�邾�낤�c�N�N�N�c�B";
		close;
	case 3:
		mes "[���E����]";
		mes "�N�N�N�c��߂̎������z���ė������B";
		mes "�����c������߂̎�����S������";
		mes "���E����=�A�X�p�S���X�l���B";
		next;
		mes "[���E����]";
		mes "������ł��x���Ȃ�����";
		mes "���ɖ߂��ĕ��a�Ȑ�����";
		mes "��������ǂ����H�ӂӁc�B";
		next;
		mes "[���E����]";
		mes "�N�N�N�c���͂������ɂ�";
		mes "���O�͂܂��s���S���낤�B";
		mes "���Ɋ댯���c�B";
		break;
	case 4:
		mes "[���E����]";
		mes "�N�N�N�c����������悤���ȁB";
		next;
		mes "[���E����]";
		mes "����Ȃɕ��a�ȕ�炵���C�ɐH��Ȃ�";
		mes "�Ƃ����̂��H";
		next;
		mes "[���E����]";
		mes "���͂𑀂�ɂ͂��O�͂܂�";
		mes "�s���S���c�B�l���������ق����ǂ��ȁB";
		break;
	case 5:
		set CHANGE_WZ,6;
		mes "[���E����]";
		mes "�悵�c�\���ɋx�񂾂��H";
		mes "����ł́A�E�B�U�[�h�]�E�ւ�";
		mes "�ŏI�������B";
		next;
		mes "[���E����]";
		mes "�����ɂ��ĊȒP��";
		mes "�������Ă�낤���c�B";
		next;
		if(select("�������A���\�ł�","���������Ă݂܂�")==1) {
			mes "[���E����]";
			mes "���d�ȓz���c�B�܂����͏E���Ă��B";
			mes "�����X�^�[�炪���O���}���Ă����";
			mes "���낤�B";
			next;
		}
		else {
			Routine;
			next;
			mes "[���E����]";
			mes "�N�N�N�c���낵���Ƃ����\��ȁB";
			mes "�܂��x���͖����B������ł�������߂�";
			mes "�Ȃ�A���ɕԂ��Ă�邼�c�ǂ�����H";
			next;
			if(select("�����𑱂��Ă�������","���낵������A��܂�")==2) {
				mes "[���E����]";
				mes "�悭�l�����ȁB�����c���O��";
				mes "���̂܂܂��������Ă���B";
				mes "���ɋA���ĕ��}�Ȑl������݂Ȃ����B";
				close2;
				warp "geffen.gat",120,110;
				end;
			}
		}
		//�䎌������
		mes "[���E����]";
		mes "����ł͖]�݂ǂ���A������";
		mes "�����Ă��B�D���Ȃ悤��";
		mes "�\��Ă��Ȃ����B";
		next;
		warp "job_wiz.gat",57,154;
		end;
	default:	//6�`9�̂Ƃ�
		mes "[���E����]";
		mes "�ȂɁH�܂��������󂯂�Ɓc�H";
		mes "�퓬�����Ɏ��s���������Ɂc�N�N�N�c�B";
		mes "���ꂾ�����@���D���Ȃ񂾂ȁc�B";
		next;
		mes "[���E����]";
		mes "�܂Ƃ��ɂ����Ȃ��Ƃ��������ƁA";
		mes "���O�͂����ƕʂ̎�����";
		mes "�󂯂Ȃ��Ă͂Ȃ�Ȃ��ȁc�B";
		mes "�s��������Ȃ�����Ɨǂ�";
		mes "���ʂ��o�����Ƃ��B";
		next;
		mes "[���E����]";
		mes "����ł͈�x�����Ă݂Ȃ����c�N�N�c�B";
		next;
		mes "[���E����]";
		mes "1. ���̒��ŁA";
		mes "�����̈Ⴄ���̂�I�ׁB";
		next;
		if(select("�}���e�B�X","�J�i�g�E�X","�K�C�A�X","�L��������")==2)
			set '@point,'@point+20;
		mes "[���E����]";
		mes "2. ���̒��ŁA���[�g�����X�^�[";
		mes "�ł͂Ȃ������X�^�[�𓚂���B";
		next;
		if(select("���[���[","���@��","���^����","�[����")==4)
			set '@point,'@point+20;
		mes "[���E����]";
		mes "3. ���̒��ŉr���������Ȃ�";
		mes "�����X�^�[�͂ǂꂩ�B";
		next;
		if(select("�}���i","�r�^�^","�X�R�[�s�I��","�K�C�A�X")==1)
			set '@point,'@point+20;
		mes "[���E����]";
		mes "4. �}�����X�t�B�A�[�Ɍ��ʓI��";
		mes "���@�𓚂���B";
		next;
		if(select("�R�[���h�{���g","�t�@�C�A�[�{���g","���C�g�j���O�{���g","�X�g�[���J�[�X")==3)
			set '@point,'@point+20;
		mes "[���E����]";
		mes "5. ���̒�����ړ����郂���X�^�[";
		mes "��I�ׁB";
		next;
		if(select("�q�h��","�}���h���S��","�V���叫�R","�t�����h��")==4)
			set '@point,'@point+20;
		mes "[���E����]";
		mes "�N�N�c�����c�o���͂ǂ����H";
		next;
		set CHANGE_WZ,CHANGE_WZ+1;
		mes "[���E����]";
		mes "�_���́c " +'@point+ "�_���B";
		if('@point < 40) {
			mes "�s���i���B���������׋����Ă����c�B";
			next;
			mes "[���E����]";
			mes "��͂肨�O�ɂ͂܂�����Ȃ����̂�";
			mes "����B�����玸�s����̂��c�B";
			close;
		}
		if('@point == 40) {
			mes "�N�N�c�܂��܂����ȁc";
			mes "�܂��퓬�������󂯂����Ă�邼�c�B";
		}
		else {
			mes "����Ȃɗǂ������Ă��āA�Ȃ�";
			mes "����ɂȂ�Ƃ������ア�̂��c�B";
		}
		next;
		if(select("�����ɗՂ݂܂�","�����ɂ��Ă�����x��������")==2) {
			Routine;
			next;
		}
		//�䎌������
		mes "[���E����]";
		mes "���x�͋����Ȃ���A���Ă���ȁc�B";
		mes "�N�N�N�c�B";
		mes "�]�ݒʂ肷���ɑ����Ă��I";
		close2;
		warp "job_wiz.gat",57,154;
		end;
	case 10:
		//�䎌������
		set CHANGE_WZ,11;
		mes "[���E����]";
		mes "�c�Ȃ�ēz���B";
		mes "�����܂ł����������ɒ��ޓz��";
		mes "���߂Ă��c�B";
		next;
		mes "[���E����]";
		mes "�悵�c��������Ă�����B";
		mes "���O����ꂽ���낤����c�N�N�N�c";
		mes "�����A^3051FD�Â�����^000000�����";
		mes "�����ė��Ȃ����B";
		next;
		mes "[���E����]";
		mes "���ꂪ���Ȃ������x�������󂯂�";
		mes "�󂩂��Ă݂�B";
		mes "������ɑ����Ă��c�B";
		close2;
		warp "job_wiz.gat",57,154;
		end;
	case 11:
		mes "[���E����]";
		mes "�������c�܂��������c�N�N�N�B";
		mes "�����ɒ��킷��̂��c����Ƃ�";
		mes "^3051FD�Â�����^000000�������ė����̂��H";
		next;
		if(select("�����ɒ���","�Â��������c")==1) {
			mes "[���E����]";
			mes "�N�N�N�c���ꂭ�炢�̍����������ƂȁB";
			mes "�܂������Ă�邩��A�撣��c�B";
			close2;
			warp "job_wiz.gat",57,154;
			end;
		}
		if(countitem(618) < 1) {
			mes "[���E����]";
			mes "�����Ă��Ȃ��ł͂Ȃ����c�B";
			close;
		}
		delitem 618,1;
		set CHANGE_WZ,12;
		mes "[���E����]";
		mes "�N�N�N�c���ǎ�ɓ���Ă������B";
		mes "�܂��悭������B";
		mes "����ł܂����̌����𑱂��邱�Ƃ�";
		mes "�ł���B���ӂ��邼�c�B";
		next;
		mes "[���E����]";
		mes "�N�N�N�c�J�g���[�k�Ɏ����͒ʂ�����";
		mes "�`���Ă����c�N�N�N�N�c�B";
		mes "�悭�撣�����B";
		close;
	case 12:
		mes "[���E����]";
		mes "�����͍��i���B";
		mes "�J�g���[�k�̌��֍s��";
		mes "�]�E�̎葱�����ς܂��������c�B";
		next;
		mes "[���E����]";
		mes "�s���Ȃ����c�B������";
		mes "�]�񂾃E�B�U�[�h�ɂȂ�Ȃ����c�B";
		mes "�ł��C������񂾁c���͂͏��";
		mes "���O��_���Ă���c�N�N�N�N�N�c�B";
		close;
	}
	//�M�L������������
	next;
	if(select("���}�ȃ}�W�V�����Ƃ��Đ����܂�","�]�E�����𑱂��Ă�������")==1) {
		mes "[���E����]";
		mes "�͂͂́c�悭�I�������B";
		mes "�E�B�U�[�h�ɖ�������񂶂�Ȃ�";
		mes "���@���g��Ȃ���΂Ȃ�Ȃ��Ƃ���";
		mes "���܂�������ȁc�B";
		next;
		mes "[���E����]";
		mes "������蓃���~��Ȃ����B";
		mes "�����ĐU��Ԃ炸�B";
		mes "�������Ă���\�͂��g���Ȃ���";
		mes "�̂�т�ƒ��ŕ�炵�Ȃ����B";
		close;
	}
	if(CHANGE_WZ == 3) {
		mes "[���E����]";
		mes "���͂͂͂́I";
		mes "���O���ǂ�قǂ̂��̂�";
		mes "���̖ڂł͂����茩�Ă��c�B";
	}
	else {
		mes "[���E����]";
		mes "�n�n�n�c���O������Ȃ��ȁc�B";
		mes "�ǂ�A����ł͂ǂꂾ���׋����ė�����";
		mes "���Ă�낤�c�B";
	}
	next;
	mes "[���E����]";
	mes "����ł͎������n�߂悤�B";
	mes "�S���������Ȃ���΂��߂��B";
	next;
	mes "[���E����]";
	mes "10��o�肷�邩��A�S�ē����Ȃ����B";
	mes "�Ԉ���Ă��ǂ����Ԉ�����̂���";
	mes "�������Ȃ��B";
	next;
	mes "[���E����]";
	mes "�N�b�N�b�N�c����ł͎����J�n�B";
	next;
	switch(rand(3)) {
	case 0:
		mes "[���E����]";
		mes "1. �X���b�g�̂���u�K�[�h�v��";
		mes "�ǂ̃����X�^�[�����ɓ�����邩�H";
		next;
		if(select("���","�y�R�y�R","�v�p","�R�{���g")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "2. ���̒��ŁA�}�W�V���������";
		mes "�|���₷�������X�^�[�͂ǂꂩ�B";
		next;
		if(select("�t���[��","�K�C�A�X","�S�[����","�~�X�g")==1)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "3. �X�g�[���J�[�X���S���ʂ��Ȃ�";
		mes "�����X�^�[�͂ǂꂩ�B";
		next;
		if(select("�G���_�[�E�B���[","�C�r���h���C�h","���@��","�}���N")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "4. �������Ő�����Lv3�����X�^�[";
		mes "���U������ꍇ�̃_���[�W���́H";
		next;
		if(select("125%","150%","175%","200%")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "5. �q�f�U�[�g�E���t�ƃt�@�~���A�[";
		mes "���������A�ǂ����������B";
		next;
		if(select("�q�f�U�[�g�E���t","�t�@�~���A�[","���ł�","�킩��Ȃ�")==1)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "6. ���̒��ŃL���[�y�b�g�ɂł��Ȃ�";
		mes "�����X�^�[�͂ǂꂩ�B";
		next;
		if(select("�|�|����","���b�_�t���b�O","�X���[�L�[","�|�C�Y���X�|�A")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "7. ���̒��ŉΑ�������ԗL����";
		mes "�����X�^�[��I�ׁB";
		next;
		if(select("�S�u�����i�Z���j","�S�u�����i�t���C���j","�S�u�����i���j","�S�u�����i�n���}�[�j")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "8. ���̒��Ŗ��@�h��͂���ԍ���";
		mes "�����X�^�[��I�ׁB";
		next;
		if(select("�z����","�`�����`����","�A���h��","�L��������")==3)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "9. �푰�̈Ⴄ�����X�^�[��";
		mes "��I�ׁB";
		next;
		if(select("�|����","�}�X�^�[�����O","�S�[�X�g�����O","�X�|�A")==3)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "10. ���̒��ŃA���f�b�g�ł͂Ȃ�";
		mes "�����X�^�[�́H";
		next;
		if(select("�h���C�N","���K���h��","�f�r�A�X","�J�[���b�c�o�[�O")==3)
			set '@point,'@point+10;
		break;
	case 1:
		mes "[���E����]";
		mes "1. �}�W�V�����ň�ԏd�v��";
		mes "�X�e�[�^�X�́H";
		next;
		if(select("INT","AGI","DEX","VIT")==1)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "2. �}�W�V�����́u�{���g�v�n���";
		mes "���@�ɖ��������������B�ǂꂩ�B";
		next;
		if(select("������","�n����","�Α���","������")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "3. �}�W�V�����̓���������";
		mes "����Ă�����̂�I�ׁB";
		next;
		if(select("�̗͂����Ȃ�","�������U�����ł���","������ׂ���̂ɗǂ�","SP������")==3)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "4. �}�W�V������������ԑ����X�́H";
		next;
		if(select("�v�����e��","�����N","�A���x���^","�Q�t�F��")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "5. INT���㏸���Ȃ��J�[�h�́H";
		next;
		if(select("�A���h���̗c���J�[�h","�r�^�^�J�[�h","�q�f�U�[�g�E���t�J�[�h","�G���_�[�E�B���[�J�[�h")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "6. �}�W�V�����̒�����I�ׁB";
		next;
		if(select("�����ꂽ�̏���","�����ꂽ���Z��","�����ꂽ�_���X�\��","�����ꂽ���@��")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "7. �}�W�V������JobLv40�̎�";
		mes "���d�l�œ�����INT�ǉ��l�́H";
		next;
		if(select("8","7","6","5")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "8. �}�W�V�������������邱�Ƃ�";
		mes "�ł��Ȃ��A�C�e���́H";
		next;
		if(select("�i�C�t","�L���b�v","�T���_��","��҂̃w�A�o���h")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "9. �}�W�V�����]�E�����ŁA";
		mes "�u�����t3�v�̐G�}�ɂȂ�z�΂�";
		mes "�ǂꂩ�B";
		next;
		if(select("�u���[�W�F���X�g�[��","���b�h�W�F���X�g�[��","�C�G���[�W�F���X�g�[��","���b�h�u���b�h")==1)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "10. ���@�Ɗ֌W�Ȃ��J�[�h�́H";
		next;
		if(select("�}���h�D�[�N�J�[�h","���@�ʃJ�[�h","�E�B���[�J�[�h","�}���[�J�[�h")==2)
			set '@point,'@point+10;
		break;
	case 2:
		mes "[���E����]";
		mes "1. �t�@�C�A�[�E�H�[�����o����̂�";
		mes "�K�v�łȂ��X�L���́H";
		next;
		if(select("�t�@�C�A�[�{���g Lv 4","�t�@�C�A�[�{�[�� Lv 5","�T�C�g Lv 1","�i�p�[���r�[�g Lv 4")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "2. �t���X�g�_�C�o�[�Ń����X�^�[��";
		mes "�����������ꍇ�A���̑�����";
		mes "�ǂ��Ȃ邩�H";
		next;
		if(select("������","�n����","�Α���","������")==1)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "3. �i�p�[���r�[�g���}�X�^�[";
		mes "�������A�����X�^�[�ɗ^����";
		mes "�_���[�W��MATK�̉��{���H";
		next;
		if(select("1.6�{","1.7�{","2�{","20�{")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "4. �X�g�[���J�[�X�g�p�̎���";
		mes "�K�v�ȃA�C�e���́H";
		next;
		if(select("���b�h�u���b�h","�u���[�W�F���X�g�[��","�C�G���[�W�F���X�g�[��","���b�h�W�F���X�g�[��")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "5. �Z�C�t�e�B�E�H�[�����o����";
		mes "�̂ɕK�v�łȂ��X�L���́H";
		next;
		if(select("�i�p�[���r�[�g Lv 7","�\�E���X�g���C�N Lv 5","SP �񕜗͌��� Lv 6","�T�C�g Lv 1")==3)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "6. SP�񕜗͌���� Lv7�܂�";
		mes "�K�������ꍇ�A�����ȃX�L������";
		mes "�ɂ��10�b�Ԃŉ񕜂���SP�́H";
		next;
		if(select("14","21","28","35")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "7. SP�� 50%�c���Ă���ꍇ�A";
		mes "�G�i�W�[�R�[�g�ɂ��_���[�W";
		mes "�����ʂ�SP����ʂ́H";
		next;
		if(select("�_���[�W18% SP1.5%","�_���[�W18% SP2%","�_���[�W24% SP1.5%","�_���[�W24% SP2%")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "8. �Z�C�t�e�B�E�H�[��Lv6�g�p";
		mes "�̎�����SP�Ɖ���񐔂́H";
		next;
		if(select("SP 40. 6��","SP 35. 6��","SP 40. 7��","SP 35. 7��")==4)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "9. Lv10�T���_�[�X�g�[���g�p";
		mes "�̎������SP�̗ʂ́H";
		next;
		if(select("84","74","64","54")==2)
			set '@point,'@point+10;
		mes "[���E����]";
		mes "10. �C�Y���[�h�_���W�����Ō��ʂ�";
		mes "�����X�L���́H";
		next;
		if(select("���C�g�j���O�{���g","�t�@�C�A�[�{���g","�R�[���h�{���g","�T�C�g")==1)
			set '@point,'@point+10;
		break;
	}
	mes "[���E����]";
	mes "����J�l�c�B";
	next;
	mes "[���E����]";
	mes "�ǂ�c�_���́c " +'@point+ "�_�c";
	switch(CHANGE_WZ) {
	case 3:
		if('@point < 100) {
			mes "�s���i���B";
			next;
			mes "[���E����]";
			mes "���̒��x�ŃE�B�U�[�h�ɂȂ낤��";
			mes "�v�����̂��c�B";
			mes "�׋����ďo�����Ȃ����B";
			set CHANGE_WZ,4;
			close;
		}
		mes "�N�N�N�c�ǂ��B��ڂ̎������ʉ߂��B";
		next;
		mes "[���E����]";
		mes "�܂����S����ȁB�O�ڂ̎�����";
		mes "�c���Ă���B�x��ł����Ȃ����c";
		mes "�N�N�N�N�N�c�B";
		break;
	case 4:
		if('@point < 80) {
			mes "�s���i���B";
			next;
			mes "[���E����]";
			mes "�܂��܂��׋�������Ȃ��c�B";
			mes "���̒��x�ł̓E�B�U�[�h�ɂȂ��Ă�";
			mes "�����X�^�[�ɊȒP�ɂ���邼�B";
			close;
		}
		mes "�ӂ�c���������̏o�����c�B";
		mes "�܂��������낤�B�ʉ߂��B";
		mes "��x�Œʉ߂ł��Ȃ��������A";
		mes "�w�͂����͔F�߂Ă��B";
		next;
		mes "[���E����]";
		mes "�܂����S����Ȃ�B�O�ڂ̎���������";
		mes "�B";
		mes "���̎����̑O�ɋx��ł����Ȃ����c�B";
		break;
	}
	set CHANGE_WZ,5;
	close;
}


//==========================================
// �O�������i���Z�j
//	���~2, �n�~2, �΁~2�̌v6�i�K
//------------------------------------------

job_wiz.gat,50,165,4	script	�퓬�i�s�v��::WZ_ChatRoom	700,{
	mes "[�퓬�i�s�v��]";
	mes "�퓬������ւ悤�����B";
	mes "�������󂯂���́A�����ҍ���";
	mes "�ւ����肭�������B";
	next;
	mes "[�퓬�i�s�v��]";
	mes "���̓]�E��]�҂��������̏ꍇ��";
	mes "���̂܂܂��΂炭���҂����������B";
	mes "�i�s�󋵂��A�i�E���X����܂��̂ŁA";
	mes "�O�̕����I����������ƂȂ�܂��B";
	next;
	mes "[�퓬�i�s�v��]";
	mes "����l�l�̐퓬������";
	mes "��5������10�����x�ƂȂ�܂��B";
	mes "�����A�������f������]�̏ꍇ��";
	mes "���̂܂܃��O�A�E�g���Ă��������B";
	close;
OnInit:
	waitingroom "�����ҍ���",10,"WZ_ChatRoom::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid '@accid;
	if(attachrid('@accid)) {
		set $@wz_tester$,strcharinfo(0);
		donpcevent "WZ_Water1::OnStart";
		warp "job_wiz.gat",116,171;
	}
	else
		enablewaitingroomevent;
	end;
}

//==============================================================
job_wiz.gat,0,0,0	script	WZ_Water1	-1,{
	end;
OnStart:
	set 'count,7;
	monster "job_wiz.gat",118,174,"--ja--",1074,1,"WZ_Water1::OnKilled";
	monster "job_wiz.gat",118,165,"--ja--",1067,1,"WZ_Water1::OnKilled";
	monster "job_wiz.gat",109,165,"--ja--",1066,1,"WZ_Water1::OnKilled";
	monster "job_wiz.gat",109,174,"--ja--",1158,1,"WZ_Water1::OnKilled";
	monster "job_wiz.gat",126,157,"--ja--",1242,1,"WZ_Water1::OnKilled";
	monster "job_wiz.gat",101,157,"--ja--",1141,1,"WZ_Water1::OnKilled";
	monster "job_wiz.gat",98,170,"--ja--",1138,1,"WZ_Water1::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "���̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r������",9;
		donpcevent "WZ_Water2::OnStart";
	}
	end;
OnTimer1000:
	announce "���̕���: ���̕����A�퓬�����J�n�ł�",9;
	end;
OnTimer2000:
	announce "���̕���: �������Ԃ� 3��",9;
	end;
OnTimer3000:
	announce "���̕���: ���ԓ��ɂ��ׂẴ����X�^�[��r�����Ă�������",9;
	end;
OnTimer33000:
	announce "���̕���: �c��2�� 30�b",9;
	end;
OnTimer63000:
	announce "���̕���: �c��2��",9;
	end;
OnTimer93000:
	announce "���̕���: �c��1�� 30�b",9;
	end;
OnTimer123000:
	announce "���̕���: �c��1��",9;
	end;
OnTimer153000:
	announce "���̕���: �c��30�b",9;
	end;
OnTimer173000:
	announce "�������Ԃ܂Ō� 10�b�I",9;
	end;
OnTimer183000:
	announce "���̕���: �I��",9;
	killmonster "job_wiz.gat","WZ_Water1::OnKilled";
	end;
OnTimer184000:
	announce "���̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r�����s",9;
	areawarp "job_wiz.gat",95,150,135,190,"geffen.gat",120,110;
	end;
OnTimer185000:
	announce "���̕���: ���̕��A���ꂵ�Ă�������",9;
	end;
OnTimer186000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0	script	WZ_Water2	-1,{
	end;
OnStart:
	set 'count,5;
	monster "job_wiz.gat",114,171,"--ja--",1068,1,"WZ_Water2::OnKilled";
	monster "job_wiz.gat",116,169,"--ja--",1068,1,"WZ_Water2::OnKilled";
	monster "job_wiz.gat",114,167,"--ja--",1068,1,"WZ_Water2::OnKilled";
	monster "job_wiz.gat",112,169,"--ja--",1068,1,"WZ_Water2::OnKilled";
	monster "job_wiz.gat",114,169,"--ja--",1170,1,"WZ_Water2::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "���̕���: " +$@wz_tester$+ "�l�A��ԃ����X�^�[�r������",9;
		areawarp "job_wiz.gat",95,150,135,190,"job_wiz.gat",116,97;
		donpcevent "WZ_Earth1::OnStart";
	}
	end;
OnTimer1000:
	announce "���̕���: ��ԃ����X�^�[���o�ꂵ�܂����B�������Ԃ� 1���ł�",9;
	end;
OnTimer30000:
	announce "���̕���: �c��30�b",9;
	end;
OnTimer50000:
	announce "���̕���: �c��10�b",9;
	end;
OnTimer60000:
	announce "���̕���: �I��",9;
	killmonster "job_wiz.gat","WZ_Water2::OnKilled";
	end;
OnTimer61000:
	announce "���̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r�����s",9;
	areawarp "job_wiz.gat",98,154,129,185,"geffen.gat",120,110;
	end;
OnTimer62000:
	announce "���̕���: ���̕��A���ꂵ�Ă�������",9;
	end;
OnTimer63000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0	script	WZ_Earth1	-1,{
	end;
OnStart:
	if( attachrid(getcharid(3,$@wz_tester$)) )
		percentheal 100,100;
	set 'count,8;
	monster "job_wiz.gat",120,102,"--ja--",1127,1,"WZ_Earth1::OnKilled";
	monster "job_wiz.gat",120,102,"--ja--",1105,1,"WZ_Earth1::OnKilled";
	monster "job_wiz.gat",124,98,"--ja--",1023,1,"WZ_Earth1::OnKilled";
	monster "job_wiz.gat",120,93,"--ja--",1121,1,"WZ_Earth1::OnKilled";
	monster "job_wiz.gat",111,93,"--ja--",1166,1,"WZ_Earth1::OnKilled";
	monster "job_wiz.gat",107,98,"--ja--",1060,1,"WZ_Earth1::OnKilled";
	monster "job_wiz.gat",111,102,"--ja--",1057,1,"WZ_Earth1::OnKilled";
	monster "job_wiz.gat",111,102,"--ja--",1103,1,"WZ_Earth1::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "�n�̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r������",9;
		donpcevent "WZ_Earth2::OnStart";
	}
	end;
OnTimer1000:
	announce "�n�̕���: �n�̕����A�퓬�����J�n�ł�",9;
	end;
OnTimer2000:
	announce "�n�̕���: �������Ԃ� 3��",9;
	end;
OnTimer3000:
	announce "�n�̕���: ���ԓ��ɂ��ׂẴ����X�^�[��r�����Ă�������",9;
	end;
OnTimer33000:
	announce "�n�̕���: �c��2�� 30�b",9;
	end;
OnTimer63000:
	announce "�n�̕���: �c��2��",9;
	end;
OnTimer93000:
	announce "�n�̕���: �c��1�� 30�b",9;
	end;
OnTimer123000:
	announce "�n�̕���: �c��1��",9;
	end;
OnTimer153000:
	announce "�n�̕���: �c��30�b",9;
	end;
OnTimer173000:
	announce "�n�̕���: �c��10�b",9;
	end;
OnTimer183000:
	announce "�n�̕���: �I��",9;
	killmonster "job_wiz.gat","WZ_Earth1::OnKilled";
	end;
OnTimer184000:
	announce "�n�̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r�����s",9;
	areawarp "job_wiz.gat",95,75,135,120,"geffen.gat",120,110;
	end;
OnTimer185000:
	mapannounce "job_wiz.gat","�n�̕���: ���̕��A���ꂵ�Ă�������",9;
	end;
OnTimer186000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0	script	WZ_Earth2	-1,{
	end;
OnStart:
	set 'count,7;
	monster "job_wiz.gat",116,100,"--ja--",1020,1,"WZ_Earth2::OnKilled";
	monster "job_wiz.gat",118,99,"--ja--",1020,1,"WZ_Earth2::OnKilled";
	monster "job_wiz.gat",118,95,"--ja--",1020,1,"WZ_Earth2::OnKilled";
	monster "job_wiz.gat",116,94,"--ja--",1020,1,"WZ_Earth2::OnKilled";
	monster "job_wiz.gat",114,95,"--ja--",1020,1,"WZ_Earth2::OnKilled";
	monster "job_wiz.gat",114,99,"--ja--",1020,1,"WZ_Earth2::OnKilled";
	monster "job_wiz.gat",116,97,"--ja--",1118,1,"WZ_Earth2::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "�n�̕���: " +$@wz_tester$+ "�l�A��ԃ����X�^�[�r������",9;
		areawarp "job_wiz.gat",95,75,135,120,"job_wiz.gat",46,99;
		donpcevent "WZ_Fire1::OnStart";
	}
	end;
OnTimer1000:
	announce "�n�̕���: ��ԃ����X�^�[���o�ꂵ�܂����B�������Ԃ� 1���ł�",9;
	end;
OnTimer30000:
	announce "�n�̕���: �c��30�b",9;
	end;
OnTimer50000:
	announce "�n�̕���: �c��10�b",9;
	end;
OnTimer60000:
	announce "�n�̕���: �I��",9;
	killmonster "job_wiz.gat","WZ_Earth2::OnKilled";
	end;
OnTimer61000:
	announce "�n�̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r�����s",9;
	areawarp "job_wiz.gat",95,75,135,120,"geffen.gat",120,110;
	end;
OnTimer62000:
	announce "�n�̕���: ���̕��A���ꂵ�Ă�������",9;
	end;
OnTimer63000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0	script	WZ_Fire1	-1,{
	end;
OnStart:
	if( attachrid(getcharid(3,$@wz_tester$)) )
		percentheal 100,100;
	set 'count,7;
	monster "job_wiz.gat",51,103,"--ja--",1119,1,"WZ_Fire1::OnKilled";
	monster "job_wiz.gat",51,92,"--ja--",1033,1,"WZ_Fire1::OnKilled";
	monster "job_wiz.gat",40,92,"--ja--",1019,1,"WZ_Fire1::OnKilled";
	monster "job_wiz.gat",40,103,"--ja--",1001,1,"WZ_Fire1::OnKilled";
	monster "job_wiz.gat",58,110,"--ja--",1178,1,"WZ_Fire1::OnKilled";
	monster "job_wiz.gat",37,89,"--ja--",1058,1,"WZ_Fire1::OnKilled";
	monster "job_wiz.gat",33,110,"�S�u����",1123,1,"WZ_Fire1::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		announce "�΂̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r������",9;
		donpcevent "WZ_Fire2::OnStart";
	}
	end;
OnTimer1000:
	announce "�΂̕���: �΂̕����A�퓬�����J�n�ł�",9;
	end;
OnTimer2000:
	announce "�΂̕���: �Ō�̕����ł��B�������Ԃ� 3��",9;
	end;
OnTimer3000:
	announce "�΂̕���: ���ԓ��ɂ��ׂẴ����X�^�[��r�����Ă�������",9;
	end;
OnTimer33000:
	announce "�΂̕���: �c��2�� 30�b",9;
	end;
OnTimer63000:
	announce "�΂̕���: �c��2��",9;
	end;
OnTimer93000:
	announce "�΂̕���: �c��1�� 30�b",9;
	end;
OnTimer123000:
	announce "�΂̕���: �c��1��",9;
	end;
OnTimer153000:
	announce "�΂̕���: �c��30�b",9;
	end;
OnTimer173000:
	announce "�΂̕���: �c��10�b",9;
	end;
OnTimer183000:
	announce "�΂̕���: �I��",9;
	killmonster "job_wiz.gat","WZ_Fire1::OnKilled";
	end;
OnTimer184000:
	announce "�΂̕���: " +$@wz_tester$+ "�l�A�����X�^�[�r�����s",9;
	areawarp "job_wiz.gat",25,75,65,120,"geffen.gat",120,110;
	end;
OnTimer185000:
	announce "�΂̕���: ���̕��A���ꂵ�Ă�������",9;
	end;
OnTimer186000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}

//==============================================================
job_wiz.gat,0,0,0	script	WZ_Fire2	-1,{
	end;
OnStart:
	set 'count,3;
	monster "job_wiz.gat",43,99,"--ja--",1129,1,"WZ_Fire2::OnKilled";
	monster "job_wiz.gat",45,99,"--ja--",1129,1,"WZ_Fire2::OnKilled";
	monster "job_wiz.gat",44,99,"--ja--",1277,1,"WZ_Fire2::OnKilled";
	initnpctimer;
	end;
OnKilled:
	set 'count,'count-1;
	if('count <= 0) {
		stopnpctimer;
		killmonster "job_wiz.gat","WZ_Fire2::OnKilled";
		set CHANGE_WZ,12;
		announce "�΂̕���: ���߂łƂ��������܂��I " +$@wz_tester$+ "�l�������ɍ��i���܂����B",9;
		areawarp "job_wiz.gat",95,75,135,120,"job_wiz.gat",46,99;
		sleep 3000;
		announce "�����I��: �������̌��ɖ߂�A�c��̎葱�����I���Ă�������",9;
		sleep 3000;
		announce "�����I��: �������I���܂��B���̎󌱎҂͗p�ӂ��Ă�������",9;
		areawarp "job_wiz.gat",30,82,61,113,"gef_tower.gat",110,33;
		sleep 1000;
		announce "�����I��: ���̕��A���ꂵ�Ă�������",9;
		sleep 1000;
		enablewaitingroomevent "WZ_ChatRoom";
		end;
	}
	end;
OnTimer1000:
	announce "�΂̕���: ��ԃ����X�^�[���o�ꂵ�܂����B�������Ԃ� 2���ł�",9;
	end;
OnTimer30000:
	announce "�΂̕���: �c��1�� 30�b",9;
	end;
OnTimer60000:
	announce "�΂̕���: �c��1��",9;
	end;
OnTimer90000:
	announce "�΂̕���: �c��30�b",9;
	end;
OnTimer110000:
	announce "�΂̕���: �c��10�b",9;
	end;
OnTimer120000:
	announce "�΂̕���: �I��",9;
	killmonster "job_wiz.gat","WZ_Fire2::OnKilled";
	end;
OnTimer121000:
	announce $@wz_tester$+ "�l�������Ɏ��s���܂����I",9;
	areawarp "job_wiz.gat",25,75,65,120,"geffen.gat",120,110;
	end;
OnTimer122000:
	announce "�΂̕���: ���̕��A���ꂵ�Ă�������",9;
	end;
OnTimer123000:
	stopnpctimer;
	enablewaitingroomevent "WZ_ChatRoom";
	end;
}