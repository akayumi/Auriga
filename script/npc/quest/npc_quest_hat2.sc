//==============================================================================
//Ragnarok Online - EP2.5 makehat script
//==============================================================================
xmas.gat,115,297,4	script	�����̔��@	111,{
	mes "[�A�E�f�B]";
	mes "- �y���������ς� -";
	mes "- �A�C�e�������̔��@ -";
	mes "- �A�E�f�B��{���Ă���Ċ��� -";
	mes "- ���]�݂̏��i��I������ -";
	mes "- �������ɃA�C�e���� -";
	mes "- ����Ă������� -";
	next;
	switch (select("^ff3152- ���ӎ����i�K�ǁj -^000000","���ʂ��X","�X�|�A�X","�_��̖؂̎�","�܂��痑�k",
								"�ق��g","�R�b�N�X","�낤����","�P�[�L�X","������")) {
	case 1:
		mes "[�A�E�f�B]";
		mes "���ӁI";
		mes "��厖�Ȓ��ӎ�����";
		mes "�\���グ�܂��B";
		mes "�������̔��@�͈�ʑ����A�C�e����";
		mes "���q�l�����ʂɈ����A�C�e������ʂ���";
		mes "�V�X�e������������Ă���܂���B";
		next;
		mes "[�A�E�f�B]";
		mes "���������āA";
		mes "^ff3152�M�d�ȃJ�[�h���h�����Ă��鑕��^000000";
		mes "�܂���";
		mes "^ff3152�������B���{�����A�C�e��^000000��";
		mes "^3152ff��ʃA�C�e���ƌ��Ȃ���^000000��舵���܂��B";
		next;
		mes "[�A�E�f�B]";
		mes "���̔��@�𗘗p�����ꍇ�́A";
		mes "�M�d�ȃA�C�e�����J�v���q�ɂ�";
		mes "�ۊǂ���A�܂��͑��̕��ɗa����";
		mes "�Ȃǂ���Ă��炲���p���������B";
		next;
		mes "[�A�E�f�B]";
		mes "������A�M�d�ȃA�C�e������������";
		mes "�Ȃ��Ă��āA�����̔��@�̃V�X�e��";
		mes "�ɂ���Ď����Ă��܂����ꍇ�A";
		mes "���̔��@�͂����̑����ɑ΂���";
		mes "��ؕۏႪ�ł��܂���B";
		next;
		mes "[�A�E�f�B]";
		mes "����ł͗ǂ��ЂƂƂ����B";
		mes "���肪�Ƃ��������܂��B";
		close;
	case 2:
		setarray '@need,2213,1036,7012,7065;	//�K�v�A�C�e��ID
		setarray '@amount,1,20,200,300;		//�K�v��
		set '@gain,5033;			//�l���A�C�e��ID
		break;
	case 3:
		setarray '@need,7033,7068,1015;
		setarray '@amount,850,300,1;
		set '@gain,5029;
		break;
	case 4:
		setarray '@need,5037,7064;
		setarray '@amount,1,500;
		set '@gain,5050;
		break;
	case 5:
		setarray '@need,5015,978,7030;
		setarray '@amount,1,1,50;
		set '@gain,5039;
		break;
	case 6:
		setarray '@need,7047;
		setarray '@amount,100;
		set '@gain,5040;
		break;
	case 7:
		setarray '@need,539,982,949,1036;
		setarray '@amount,120,1,330,450;
		set '@gain,5026;
		break;
	case 8:
		setarray '@need,2279,7035,526;
		setarray '@amount,1,50,100;
		set '@gain,5028;
		break;
	case 9:
		setarray '@need,529,530,538,539,999;
		setarray '@amount,10,5,15,20,10;
		set '@gain,5024;
		break;
	case 10:
		mes "[�A�E�f�B]";
		mes "- �����p���肪�Ƃ��������܂��� -";
		close;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {	//�A�C�e���s����
			mes "[�A�E�f�B]";
			mes "- �r�[�r�[ -";
			mes "- �S�D���S�D�� -";
			mes "- �A�C�e���s���ł� -";
			mes "- �K�N�K�N�K�N -";
			mes "- �������炩��Ȃ��I -";
			close;
		}
	}
	mes "- ���Ȃ��̓A�C�e���� -";
	mes "- ���삷��̂ɕK�v�� -";
	mes "- �i���𓊓����ɓ��ꂽ -";
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	mes "[�A�E�f�B]";
	mes "- �s�R�s�R�s�R -";
	mes "- �K�[�K�[�K -";
	mes "- �u�D���u�D�� -";
	mes "- �W�W�W�W�W -";
	mes "- �s���|�I -";
	mes "- �����p���肪�Ƃ��������܂��� -";
	close;
}

//=====================================================================
xmas.gat,117,295,4	script	�����̔��@��	704,{
	mes "[�e�B�e�B�[�N�[�y]";
	mes "�ӂ��ӂ��Ӂc�c";
	mes "��������Ⴂ�A���̓��e�B�G��";
	mes "��������H�꒷�u�e�B�e�B�[�N�[�y�v";
	mes "�V�������Ƃɑ咧��I";
	next;
	switch (select("�����̔��@�ɂ��ĕ���","�����̔��@���i����","��b����߂�")) {
	case 1:
		mes "[�e�B�e�B�[�N�[�y]";
		mes "���̍����̐Ⴞ��܂̌���";
		mes "�ǂ����Ă��������B";
		mes "����͂��������ȍ��ł��傤�H";
		next;
		mes "[�e�B�e�B�[�N�[�y]";
		mes "�ق�A�r�ł����ł������";
		mes "�݂Ȃ����B���ł����邩��B";
		mes "�ӂӂӁc";
		mes "�܂�����͏�k�Ƃ��āA���ꂪ";
		mes "�V���������A�C�e�����o��";
		mes "�����̔��@�Ȃ�ł���B";
		next;
		mes "[�e�B�e�B�[�N�[�y]";
		mes "�����̔��@���v�����邢������";
		mes "�A�C�e�����A�Ⴞ��܂̌��ɕ���";
		mes "���ނƁA�N���]�񂾑f�G�ȃA�C�e��";
		mes "����ɓ���邱�Ƃ��ł����ł��B";
		next;
		break;
	case 2:
		mes "[�e�B�e�B�[�N�[�y]";
		mes "�ӂ��ӂ��Ӂc�c";
		mes "��H���̓V�˂ɉ������₪";
		mes "����ƁH";
		mes "���̎����̔��@�̏��i�ł����B";
		mes "�ǂ�ɂ��ĕ��������̂��ȁH";
		next;
		switch (select("���ʂ��X","�X�|�A�X","�_��̖؂̎�","�܂��痑�k","�ق��g","�R�b�N�X","�낤����","�P�[�L�X","��b����߂�")) {
			case 1:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u���ʂ��X�v";
				mes "�L���̃w�A�o���h 1";
				mes "�h���S���̗� 20";
				mes "�����؂̌s 200";
				mes "���b�R�̖є� 300";
				break;
			case 2:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u�X�|�A�X�v";
				mes "�ŃL�m�R�̖E�q 850";
				mes "�R������ 300";
				mes "�����ׂ��� 1";
				break;
			case 3:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u�_��̖؂̎��v";
				mes "�؂̎� 1";
				mes "�Ƃ�ڂ̉H 500";
				break;
			case 4:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u�܂��痑�k�v";
				mes "�����p���k 1";
				mes "�F�̐��� 1";
				mes "�����T�̒� 50";
				break;
			case 5:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u�ق��g�v";
				mes "�N�I";
				mes "�Ȃ��Ȃ��킩��l���ˁI";
				mes "�ӂӁc�c�Ƃɂ������ꂾ�B";
				mes "- �A���X�̃G�v���� 100 -";
				break;
			case 6:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u�R�b�N�X�v";
				mes "�ЂƂ����P�[�L 120";
				mes "���F�̐��� 1";
				mes "���炩�Ȗ� 330";
				mes "�h���S���̗� 450";
				break;
			case 7:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u�낤�����v";
				mes "���ΐ� 1";
				mes "�}�b�` 50";
				mes "���[�����[���[ 100";
				break;
			case 8:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "�u�P�[�L�X�v";
				mes "�L�����f�B 10";
				mes "�X�e�B�b�N�L�����f�B 5";
				mes "�悭�Ă����N�b�L�[ 15";
				mes "�ЂƂ����P�[�L 20";
				mes "�|�S 10";
				break;
			case 9:
				mes "[�e�B�e�B�[�N�[�y]";
				mes "���ł��Ȃ�ł������Ă݂āB";
				mes "�Ȃ�ł��m���Ă���u�V�ˁv�ɁB";
				mes "���̓��]�͂��̐��ň�ԗD�G�B";
				break;
		}
		next;
		mes "[�e�B�e�B�[�N�[�y]";
		mes "�������͓V�˂��I";
		mes "�ӂ��ӂ��ӂ��Ӂc�c";
		mes "�͂��͂��͂��́c�c";
		close;
	case 3:
		break;
	}
	mes "[�e�B�e�B�[�N�[�y]";
	mes "���͓V�˂��`";
	mes "����ȑf�G�ȃA�C�e���Ƌ@�B��";
	mes "�n��o�������̓��͍ō��I";
	mes "�ӂ��ӂ��Ӂc�c";
	next;
	mes "- ��������H�꒷ -";
	mes "- �e�B�e�B�[�N�[�y�� -";
	mes "- �Ⴞ��܎����̔��@�� -";
	mes "- �w�����Ă����������� -";
	mes "- ��щ���Ă��� -";
	close;
}

//=====================================================================
alberta.gat,136,79,1	script	�X�q�����삳��	71,{
	mes "[�e���y�X�g��]";
	mes "�����`����₩�Ȓ����c�c";
	mes "�����ł������Ă���ƋC����������c�c";
	mes "���΂炭�X�����x�݂ɂ��āA";
	mes "�����ŋC���]�����邱�Ƃɂ����́B";
	next;
	mes "[�e���y�X�g��]";
	mes "�ł��c�c���܂�ɂ���������������";
	mes "�����ɂ͈�����c�c";
	mes "�̂ǂ������āc�c�����A";
	mes "���|�[�V���������݂�����c�c";
	next;
	if(select("�͂��A�ǂ���","�����Ŕ����ẮH")==2) {
		mes "[�e���y�X�g��]";
		mes "����A������ǂ�ȑԓx�I";
		close;
	}
	if(countitem(503)<1) {
		mes "[�e���y�X�g��]";
		mes "���H�ǂ��ɉ��|�[�V������";
		mes "�����ł����H";
		close;
	}
	mes "[�e���y�X�g��]";
	mes "�����A���肪�Ƃ��I";
	mes "����Ȃɗǂ��l�ɉ�Ȃ�āc�c";
	next;
	delitem 503,1;
	mes "- �S�N�S�N�S�N -";
	next;
	mes "[�e���y�X�g��]";
	mes "���`�`";
	mes "�ƂĂ��������������ł��I���肪�Ƃ��I";
	next;
	if(select("�{���ɏ����ł��ˁ`","����ɉ�����������")==1) {
		mes "[�e���y�X�g��]";
		mes "�ˁ` �{���ɏ����ł��B";
		next;
		mes "[�e���y�X�g��]";
		mes "�����ɖ߂��";
		mes "^0000ff�������ȖX�q^000000�Ƃ�";
		mes "^0000ff�Ƃ񂪂�X�q^000000�Ƃ�";
		mes "^0000ff�V���N�n�b�g^000000�Ȃ񂩂����邯�ǁB";
		next;
		mes "[�e���y�X�g��]";
		mes "���A���i�͖X�q�����J���Ă���́B";
		mes "���낤�Ǝv���Ď����Ă�����������";
		mes "�g��Ȃ��悤�ɂ��Ă��񂾂��ǁc�c";
		mes "���������킯�ɂ������Ȃ���ˁc�c";
		next;
		set @menu,select("�������ȖX�q!?","�Ƃ񂪂�X�q!?","�V���N�n�b�g!?");
		mes "[�e���y�X�g��]";
		mes "�ӂӁA���͖X�q���l�ł�����B";
		mes "���Ă����������܂����ˁc�c";
		next;
		mes "[�e���y�X�g��]";
		mes "�C����蒼���āc�c";
		switch(@menu) {
		case 1:
			mes "�����ւ�A�������ȖX�q�͂ˁA";
			next;
			mes "[�e���y�X�g��]";
			mes "^0000ff�����ȕz^000000 250��";
			mes "�J�[�h���h���� ^0000ff�n�b�g^000000 1��";
			mes "�J�[�h���h���� ^0000ff�L���b�v^000000 1��";
			mes "^0000ff�_�炩���H��^000000 600 ��";
			setarray '@need,1059,2221,2227,7063;
			setarray '@amount,250,1,1,600;
			set '@gain,5032;
			break;
		case 2:
			mes "�����ւ�A�Ƃ񂪂�X�q�͂ˁc�c";
			next;
			mes "[�e���y�X�g��]";
			mes "^0000ff�E�B�U�[�h�n�b�g^000000 1��";
			mes "^0000ff�h���S���̗�^000000 400��";
			mes "^0000ff�J�r�̕�^000000 50��";
			mes "^0000ff�G���_�[�E�B���[�J�[�h^000000 1��";
			setarray '@need,2252,1036,7001,4052;
			setarray '@amount,1,400,50,1;
			set '@gain,5027;
			break;
		case 3:
			mes "�����ւ�A�V���N�n�b�g�͂ˁc�c";
			next;
			mes "[�e���y�X�g��]";
			mes "^0000ff�E�B�U�[�h�n�b�g^000000 1��";
			mes "^0000ff�Ñ㋛�̐O^000000 450��";
			mes "^0000ff����������������^000000 1200��";
			setarray '@need,2252,1054,943;
			setarray '@amount,1,450,1200;
			set '@gain,5045;
			break;
		}
		mes "������΍�邱�Ƃ��ł��܂��B";
	}
	else {
		mes "[�e���y�X�g��]";
		mes "������Ȃ�ł�����́`";
		mes "���𔄂�悤�ɂ����Ⴞ�߂ł���[";
		next;
		mes "[�e���y�X�g��]";
		mes "����c�c�₽���|�[�V���������������A";
		mes "������������Ă���������ł���";
		mes "�����ɂ͍ޗ��������āc�c";
		next;
		mes "[�e���y�X�g��]";
		mes "����c�c";
		mes "^0000ff���z�_�̏ے�^000000 1��";
		mes "^0000ff����^000000 10��";
		mes "^0000ff�|�S^000000 40��";
		mes "^0000ff�ΒY^000000 50��";
		mes "^0000ff�I���f�I�R��^000000 2��";
		next;
		mes "[�e���y�X�g��]";
		mes "���ꂾ������Ύ���";
		mes "�u���z�_�̊��v�Ƃ�������";
		mes "����Ă����邱�Ƃ��ł���̂Ɂc�c";
		setarray '@need,7086,969,999,1003,984;
		setarray '@amount,1,10,40,50,2;
		set '@gain,5022;
	}
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			if('@gain==5022) {	//���z�_�̊��̂Ƃ�
				mes "[�e���y�X�g��]";
				mes "���|�[�V�����̂���ł���`";
				mes "�萔���͂��������܂���B";
			}
			else {			//���̑��̑����i�̂Ƃ�
				mes "[�e���y�X�g��]";
				mes "���|�[�V�����������������̂ŁA";
				mes "��������ޗ��������Ă����܂����B";
				next;
				mes "[�e���y�X�g��]";
				mes "���x���X�ɗV�тɗ��Ă��������ˁB";
			}
			close;
		}
	}
	mes "[�e���y�X�g��]";
	mes "����I";
	mes "�ޗ���S�������Ă邶�Ⴀ��܂��񂩁I";
	mes "���A�����ޗ��̒���";
	mes "^ff0000�J�[�h���h�����Ă�����A";
	mes "���B����Ă���A�C�e��^000000�������Ă�����";
	mes "�q�ɂɓ���Ă��Ă��������ȁB";
	next;
	mes "[�e���y�X�g��]";
	mes "���|�[�V�����ւ̂���ƌ����Ă�";
	mes "�Ȃ�ł����A���̍ޗ���n����";
	mes "���ꂽ�炷���ɍ���č����グ�܂���B";
	mes "�ǂ����܂����H";
	next;
	if(select("����Ă��������I","����͌��\�ł�")==2) {
		//�Z���t���ݒ�
		close;
	}
	mes "[�e���y�X�g��]";
	mes "�͂��A�ł��܂����I";
	mes "�ǂ��ł����H���̘r�O�́B";
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	close;
}

//=====================================================================
alberta.gat,120,53,1	script	�������Ȏ��l	51,{
	if(countitem(10007) >= 1 && countitem(968) >= 50) {
		setarray '@need,10007,968;
		setarray '@amount,1,50;
		set '@gain,5042;	//�V�j�����L�����v
	}
	else if(countitem(5041) >= 1 && countitem(999) >= 10) {
		setarray '@need,5041,999;
		setarray '@amount,1,10;
		set '@gain,5048;	//�O�����̃w�A�s��
	}
	else if(countitem(2271) >= 1 && countitem(975) >= 1) {
		setarray '@need,2271,975;
		setarray '@amount,1,1;
		set '@gain,5047;	//�t�@�b�V�����T���O���X
	}
	else if(countitem(7013) >= 1200) {
		setarray '@need,7013,0;
		setarray '@amount,1200,0;
		set '@gain,5041;	//�n�[�g�̃w�A�s��
	}
	if('@gain) {
		mes "[�W�N]";
		mes "������܂����A������܂����I";
		mes getitemname('@gain)+ "�ł��ˁc�c";
		mes "������Ƒ҂��Ă�������";
		next;
		mes "- �J�`���J�`�� -";
		next;
		delitem '@need[0],'@amount[0];
		delitem '@need[1],'@amount[1];
		getitem '@gain,1;
		mes "[�W�N]";
		mes "�͂��A����ł��B";
		mes "���J�ɍ��܂����B";
		mes "�厖�ɂ��Ă��������ˁB";
		close;
	}
	//�A�C�e�����Ȃ��ꍇ
	mes "[�W�N]";
	mes "�����`��c�c����ς�C�̓�����";
	mes "�ǂ��ł��ˁ`";
	mes "����H�������ɗp�ł��傤���H";
	mes "���͎������l���Ƃ������Ƃ�";
	mes "�m���Ă���̂ł��ˁB";
	next;
	mes "[�W�N]";
	mes "�ӂ��c�c����ς�L���ȏ��l��";
	mes "�ǂ��ɍs���Ă��킩���Ă��܂��̂��c�c";
	mes "�x�މɂ�����Ⴕ�Ȃ��c�c";
	next;
	mes "[�W�N]";
	mes "�����ƁA�����~�����ł����H";
	mes "�����Ă݂Ă��������B";
	next;
	set @menu,select("�V�j�����L���b�v","�O�����̃w�A�s��","�t�@�b�V�����T���O���X","�n�[�g�̃w�A�s��");
	mes "[�W�N]";
	mes "�Ȃ񂾁A������舵���Ă���i���܂�";
	mes "�����ƒm���Ă�񂶂�Ȃ��ł����B";
	mes "�܂������N�ɕ������̂��c�c�B";
	next;
	mes "[�W�N]";
	switch(@menu) {
	case 1:
		mes "�V�j�����L���b�v�́c�c";
		next;
		mes "[�W�N]";
		mes "^0000ff�V���N���{��^000000 1��";
		mes "^0000ff�I�[�N�E�҂̏�^000000 50��";
		mes "������Ηǂ��ł��B";
		mes "�Ђ���Ƃ��Ă�����m���Ă����Ƃ��c�H";
		break;
	case 2:
		mes "�O�����̃w�A�s���́c�c";
		next;
		mes "[�W�N]";
		mes "^0000ff�n�[�g�̃w�A�s��^000000 1��";
		mes "^0000ff�|�S^000000 10�������";
		mes "�ǂ��ł��B";
		mes "�Ђ���Ƃ��Ă�����m���Ă����Ƃ��c�c";
		mes "�H";
		break;
	case 3:
		mes "�t�@�b�V�����T���O���X�́c�c";
		next;
		mes "[�W�N]";
		mes "^0000ff���ዾ^000000 1��";
		mes "^0000ff�ԐF�̐���^000000 1��";
		mes "������Ηǂ��ł��B";
		mes "�Ђ���Ƃ��Ă�����m���Ă����Ƃ��c�c";
		mes "�H";
		break;
	case 4:
		mes "�n�[�g�̃w�A�s���́c�c";
		next;
		mes "[�W�N]";
		mes "�P���ł��B";
		mes "^0000ff�T���S^000000 1200�������";
		mes "�ǂ��ł��B";
		mes "�Ђ���Ƃ��Ă�����m���Ă����Ƃ��c�c";
		mes "�H";
		break;
	}
	mes "�܁A�Ƃɂ������ꂪ�ޗ��ł��B";
	close;
}

//=====================================================================
payon_in01.gat,56,12,7	script	�N	89,{
	mes "[�N]";
	mes "���̗p���c�c";
	next;
	if(select("���ʂȕi��������Ă����Ƃ��c�c","�������A���炵�܂���")==2) {
		mes "[�N]";
		mes "���ށc�c";
		close;
	}
	mes "[�N]";
	mes "�N����̂̂��Ƃ͒m���Ă���";
	mes "�悤������A�p�����������������c�c";
	next;
	switch (select("�V�g�̊�","�q�����X","��ł܂����܂�")) {
	case 1:
		setarray '@need,2254,2229,7036;
		setarray '@amount,1,1,5;
		set '@gain,5025;
		mes "[�N]";
		mes "�X���b�g�t���w���� 1��";
		mes "�V�g�̃w�A�o���h 1��";
		mes "�n�e�B�[�̉� 5��";
		break;
	case 2:
		setarray '@need,1038,7048;
		setarray '@amount,600,40;
		set '@gain,5038;
		mes "[�N]";
		mes "�q�����̊p 600��";
		mes "�O���t�H���̒� 40��";
		break;
	case 3:
		close;
	}
	next;
	mes "[�N]";
	mes "���ӁI";
	mes "�N�����������i�������B����Ă�����A";
	mes "�J�[�h���h�����Ă����Ƃ��Ă�";
	mes "���͂�����ޗ��Ƃ��Ĉ�������A";
	mes "���ꂪ���Ȃ�q�ɂɓ����Ȃ肵��";
	mes "�ޗ��Ƃ�����̂��������ɓn���B";
	next;
	mes "[�N]";
	mes "�ޗ��͗p�ӂ������H";
	next;
	if(select("�n��","��߂�")==2) {
		mes "[�N]";
		mes "���ށc�c";
		close;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {	//�A�C�e���s����
			mes "[�N]";
			mes "�ޗ�������Ȃ��c�c";
			mes "��������m�F���Ă���悤�ɁB";
			close;
		}
	}
	mes "[�N]";
	mes "������";
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	close;
}

//=====================================================================
comodo.gat,228,159,4	script	�w�A�o���h���o����	700,{
	mes "[�w�A�o���h���o����]";
	mes "�͂��A����ɂ��́`";
	mes "�w�A�o���h�����܂��񂩁H";
	mes "�K�[���t�����h�ւ̑��蕨�Ȃ�";
	mes "����ς�w�A�o���h�I";
	next;
	mes "[�w�A�o���h���o����]";
	mes "�ȒP�ȍޗ����������ė����";
	mes "�����f�G�ȃw�A�o���h�������";
	mes "���������܂���`";
	mes "�����x���������������B";
	next;
	switch (select("�\���˂̃w�A�o���h","�d���̃w�A�o���h","�Ȃ̃o���_�i","���o���_�i")) {
	case 1:
		setarray '@need,2608,7069;
		setarray '@amount,1,500;
		set '@gain,5036;
		break;
	case 2:
		setarray '@need,2233,746;
		setarray '@amount,1,20;
		set '@gain,5034;
		break;
	case 3:
		set '@need,1099;
		set '@amount,1500;
		set '@gain,5049;
		break;
	case 4:
		setarray '@need,2211,978,7003;
		setarray '@amount,1,1,300;
		set '@gain,5052;
		break;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {	//�A�C�e���s����
			mes "[�w�A�o���h���o����]";
			mes "�͂��A" +getitemname('@gain)+ "�ł��ˁI";
			mes "�ޗ����������K�v�ł�����A";
			mes "�p�ӂ��Ă��Ă��������ˁB";
			next;
			mes "[�w�A�o���h���o����]";
			switch(@menu) {
			case 1:
				mes "�\���˂̃w�A�o���h����邽�߂ɂ́c�c";
				mes "^4169E1���U���[^000000 1��";
				mes "^4169E1��ꂽ�Z^000000 500��";
				break;
			case 2:
				mes "�d���̃w�A�o���h����邽�߂ɂ́c�c";
				mes "^4169E1�X���b�g�t���T�[�N���b�g^000000 1��";
				mes "^4169E1�K���X��^000000 20��";
				break;
			case 3:
				mes "�Ȃ̃o���_�i����邽�߂ɂ́c�c";
				mes "^4169E1�{���{�����l��^000000 1500��";
				break;
			case 4:
				mes "���o���_�i����邽�߂ɂ́c�c";
				mes "^4169E1����^000000 1��";
				mes "^4169E1�F�̐���^000000 1��";
				break;
			}
			mes "���K�v�ł��B";
			next;
			mes "[�w�A�o���h���o����]";
			mes "�����Ă��Ă����������炷����";
			mes "���܂���`";
			mes "����ł́I";
			close;
		}
	}
	mes "[�w�A�o���h���o����]";
	mes "�͂��A" +getitemname('@gain)+ "�ł��ˁI";
	mes "�ޗ����������悤�ł�����A";
	mes "�����ɂ���܂��傤�B";
	next;
	mes "[�w�A�o���h���o����]";
	mes "�����Œ��ӁI";
	mes "���B����Ă�����A�J�[�h���h������";
	mes "�����肵�Ă��A�ޗ��Ƃ��Č��Ȃ����";
	mes "�����Ă��܂��ꍇ������܂��B";
	next;
	mes "[�w�A�o���h���o����]";
	mes "�ޗ��ɕK�v�Ȃ��������Ă��ĂˁB";
	mes "��낵����΍��܂��傤���B";
	next;
	if(select("������","�͂�")==1) {
		mes "[�w�A�o���h���o����]";
		mes "���������B���̕��͑q�ɂɂł�";
		mes "����Ă�����Ⴂ�`";
		close;
	}
	mes "^4169E1�S�\�S�\�c�K�T�S�\�c^000000";
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	mes "[�w�A�o���h���o����]";
	mes "�����A����I�Y��ɂł��܂����I";
	mes "�܂����p���Ă��������ˁ`�ł́I";
	close;
}

//=====================================================================
comodo.gat,273,137,4	script	���l	702,{
	mes "[���ʐE�l]";
	mes "���́A�嗤��n������Ȃ���";
	mes "���܂��܂ȏ����d����Ă��܂��B";
	mes "���܂ɒ��������Ȃǂ������@��";
	mes "�w��ŗ����肵�܂��B";
	next;
	mes "[���ʐE�l]";
	mes "���̂������𕷂��Ă݂܂��񂩁H";
	mes "���܂ōޗ����W�߂邱�Ƃ��ł��Ȃ���";
	mes "���Ȃ��������������ł���B";
	next;
	switch (select("�z�R�w�����b�g","���C�~���","�������������҂̐S","�t�@���g���}�X�N")) {
	case 1:
		mes "[���ʐE�l]";
		mes "�z�R�w�����b�g�E�E�E�E�E�E����̓Q�t�F����";
		mes "�Y�z�ŕ������b�ł��B";
		mes "�����m�̒ʂ�A�Y�z�͂ƂĂ��Â���";
		mes "�����肪�K�v�ƂȂ�܂��B";
		next;
		mes "[���ʐE�l]";
		mes "�������A�����v�������Ďd���������";
		mes "�肪�ǂ��邽�߁A�悭�����X�^�[�B��";
		mes "�P�����󂯂܂����B";
		next;
		mes "[���ʐE�l]";
		mes "����Ȃ�����A�z�v�̈�l��������";
		mes "�H���X�����ǂ��ă����v��t������";
		mes "�ł��B�܂�A���肪�g�����Ԃ�";
		mes "�O�����邱�Ƃ��ł���w�����b�g�E�E�E�E�E�E";
		mes "���ꂪ�z�R�w�����b�g�ł��B";
		next;
		mes "[���ʐE�l]";
		mes "�z�R�w�����b�g�����Ȃ�΁A";
		mes "�������̍ޗ����K�v�ł��B";
		mes "^4169E1�H���X^000000 1��";
		mes "^4169E1�낤����^000000 1��";
		mes "^4169E1������^000000 1��";
		mes "^4169E1�|�S^000000 25��";
		next;
		if(countitem(5009) >= 1 && countitem(5028) >= 1 && countitem(999) >= 25 && countitem(747) >= 1) {
			mes "[���ʐE�l]";
			mes "������";
			next;
			delitem 5009,1;
			delitem 5028,1;
			delitem 999,25;
			delitem 747,1;
			getitem 5031,1;
			close;
		}
		break;
	case 2:
		mes "[���ʐE�l]";
		mes "���C�~��݁E�E�E�E�E�E����̓A���x���^�n����";
		mes "�������b�ł��B";
		mes "���l�����͂����J�[�g�ɕi��������";
		mes "�I�X���J���܂��ˁB";
		next;
		mes "[���ʐE�l]";
		mes "�Ƃ���ŁA�����̒n��ł͕����^�Ԏ�";
		mes "���������@��p����Ƃ����܂��B";
		mes "�܂��ɂ��ꂪ���C�~��݂ł��傤�B";
		next;
		mes "[���ʐE�l]";
		mes "�ו����܂Ƃ߂ē��̏�ɍڂ��A";
		mes "�o�����X��ۂ��Đi�݂܂��B";
		mes "��������Η��肪���R�ɂȂ���";
		mes "��Ƃ��ł��܂��ˁB";
		next;
		mes "[���ʐE�l]";
		mes "���C�~��݂����Ȃ�A��������";
		mes "�ޗ����K�v�ƂȂ�܂��B";
		mes "^4169E1�����ȕz^000000 150��";
		mes "^4169E1�Ö؂̘I^000000 100��";
		mes "^4169E1�F�̐���^000000 1��";
		next;
		if(countitem(1059) >= 150 && countitem(907) >= 100 && countitem(978) >= 1) {
			mes "[���ʐE�l]";
			mes "������";
			next;
			delitem 1059,150;
			delitem 907,100;
			delitem 978,1;
			getitem 5023,1;
			close;
		}
		break;
	case 3:
		mes "[���ʐE�l]";
		mes "�������������҂̐S�E�E�E�E�E�E";
		mes "����̓����N�ɓ`���`���I��";
		mes "���l�̘b�ł��E�E�E�E�E�E";
		mes "�܂��߂Ɏd�����Ȃ����炵�Ă���";
		mes "���̏��l�́A���ɂ����ǂ��M���h";
		mes "�ƑΗ�����悤�ɂȂ�܂����E�E�E�E�E�E";
		next;
		mes "[���ʐE�l]";
		mes "������߂����Ă����M���h�ɂƂ���";
		mes "���̐����ȏ��l�͂ƂĂ��ז���";
		mes "�Ȃ�����ł��B";
		mes "����Ŏs�ꉿ�i�𑀍삵�āA����";
		mes "���l�̏�����W�Q����悤��";
		mes "�Ȃ����̂ł��E�E�E�E�E�E";
		next;
		mes "[���ʐE�l]";
		mes "�����Ă��̏��l�͂قƂ�ǑS�Ă�";
		mes "���������A�c�����̂̓J�[�g�̒��";
		mes "�������������̃A�C�e�������E�E�E�E�E�E";
		mes "�ނ͋����Ȃ��玩���̍��̋�����";
		mes "�i����ׂ���̕i��������̂ł��B";
		next;
		mes "[���ʐE�l]";
		mes "���ꂪ�܂��Ɂu�������������҂̐S�v";
		mes "�Ȃ̂ł��B��������Ă���ƁE�E�E�E�E�E";
		mes "���킶��Ə�S�������Ă��āA";
		mes "���i���𔃂��Ă��������Ȃ�Ƃ��E�E�E�E�E�E";
		mes "�܂��A�`���͓`���ł����B";
		next;
		mes "[���ʐE�l]";
		mes "�������������҂̐S�����Ȃ�A";
		mes "�������̍ޗ����K�v�ł��B";
		mes "^4169E1�X���b�g�t���T�[�N���b�g^000000 1��";
		mes "^4169E1����^000000 1��";
		mes "^4169E1�|�S^000000 20��";
		mes "^4169E1���炩�Ȗ�^000000 80��";
		mes "^4169E1�ׂƂׂƂ���t��^000000 800��";
		next;
		if(countitem(2233) >= 1 && countitem(969) >= 1 && countitem(999) >= 20 && countitem(949) >= 80 && countitem(938) >= 800) {
			mes "[���ʐE�l]";
			mes "������";
			next;
			delitem 2233,1;
			delitem 969,1;
			delitem 999,20;
			delitem 949,80;
			delitem 938,800;
			getitem 5021,1;
			close;
		}
		break;
	case 4:
		mes "[���ʐE�l]";
		mes "�t�@���g���}�X�N�E�E�E�E�E�E���̘b��";
		mes "�A���f�o�����ŕ����܂����B";
		mes "�����ȗ���������l�̒j�̘b�ł��E�E�E�E�E�E";
		next;
		mes "[���ʐE�l]";
		mes "�I�y�����̉��l�E�E�E�E�E�E�����������̎��";
		mes "��������l�̒j�����܂����E�E�E�E�E�E";
		mes "�������ނ̊�͏X���A���ʂ�����";
		mes "��炵�Ă�����ł��B";
		next;
		mes "[���ʐE�l]";
		mes "���̒j�͂��̏����̎��������";
		mes "���܂������A�Ȃ��Ȃ��ޏ��̑O��";
		mes "����邱�Ƃ��ł��܂���ł����B";
		mes "����Ȃ�����A�ޏ��ɐ��̂��B����";
		mes "�܂܏����Ă����܂����B";
		next;
		mes "[���ʐE�l]";
		mes "�ނ̔߂����v���������������ʂŁA";
		mes "���̃I�y�����ʂƈ�������͋C��";
		mes "����܂��B";
		next;
		mes "[���ʐE�l]";
		mes "�t�@���g���}�X�N�����Ȃ�A";
		mes "�������̍ޗ����K�v�ł��B";
		mes "^4169E1�I�y������^000000 1��";
		mes "^4169E1�֖͗l�̔�^000000 50��";
		next;
		if(countitem(2281) >= 1 && countitem(1048) >= 50) {
			mes "[���ʐE�l]";
			mes "������";
			next;
			delitem 2281,1;
			delitem 1048,50;
			getitem 5043,1;
			close;
		}
		break;
	}
	mes "[���ʐE�l]";
	mes "�ޗ����������Ă�����������A";
	mes "��������Ă݂����Ǝv���܂��B";
	mes "����ł͗ǂ������E�E�E�E�E�E";
	close;
}