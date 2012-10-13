package y.view;

public class yChineseLanguage implements yLanguage {

	@Override
	public String getAboutLabel() {
		return "���� y and y ...";
	}

	@Override
	public String getAboutViewContent() {
		return "���� y and y";
	}

	@Override
	public String getAboutViewTitle() {
		return "���� y and y";
	}

	@Override
	public String getCloseLabel() {
		return "�ر�";
	}

	@Override
	public String[] getColorNames() {
		String[] colorNames = {
	            "��ɫ",  "��ɫ",  "��ɫ", "���ɫ",
	            "����ɫ",   "��ɫ",  "����",  "��ɫ",
	            "��ɫ", "��ɫ",     "������ɫ",  "��ɫ",
	            "��ɫ",   "���Ϻ�ɫ", "ˮ��ɫ",  "��ɫ"
	        };
		return colorNames;
	}

	@Override
	public String getContactAuthorLabel() {
		return "��ϵ����";
	}

	@Override
	public String getDeleteLabel() {
		return "ɾ��";
	}

	@Override
	public String getEditLabel() {
		return "�༭";
	}

	@Override
	public String getExitLabel() {
		return "�˳�\tAlt+F4";
	}

	@Override
	public String getFileLabel() {
		return "�ļ�";
	}

	@Override
	public String getFontLabel() {
		return "����...";
	}

	@Override
	public String[] getFontNames() {
		String[] fontNames = {
				"Arial", "Comic Sans MS", "Courier New", "MS Sans Serif"
				,"Tahoma", "Times New Roman"
		};
		return fontNames;
	}

	@Override
	public String getHelpLabel() {
		return "����";
	}

	@Override
	public String getInsertLabel() {
		return "����";
	}

	@Override
	public String getInsertPictureLabel() {
		return "����ͼƬ";
	}

	@Override
	public String getNewDocumentLabel() {
		return "����";
	}

	@Override
	public String getNewToolTip() {
		return "�����µ��ļ�";
	}

	@Override
	public String getOpenLabel() {
		return "��";
	}

	@Override
	public String getOpenToolTip() {
		return "���µ��ļ�";
	}

	@Override
	public String getPictureFromFileLabel() {
		return "��...��\tCtrl+O";
	}

	@Override
	public String[] getFilterNames() {
		return new String [] {"ͼƬ�ļ�", "�����ļ�(*.*)"};
	}
	
	@Override
	public String[] getExtensionsFilterNames() {
		return new String[] {"�洢�ļ�(*.yy)"};
	}
	
	@Override
	public String getRedoLabel() {
		return "����\tCtrl+Y";
	}

	@Override
	public String getRedoToolTip() {
		return "����ǰһ�β���";
	}

	@Override
	public String getSaveAsLabel() {
		return "���Ϊ...";
	}

	@Override
	public String getSaveDocumentLabel() {
		return "����\tCtrl+S";
	}

	@Override
	public String getSaveToolTip() {
		return "���浱ǰ�ļ�";
	}

	@Override
	public String getUndoLabel() {
		return "����\tCtrl+Z";
	}

	@Override
	public String getUndoToolTip() {
		return "�������һ�β���";
	}

	@Override
	public String getTitle() {
		return "�߼��ı��༭��";
	}

	@Override
	public String getSavedFileLabel() {
		return "�ļ��� ";
	}

	@Override
	public String getSavedFileTitle() {
		return "���Ϊ ";
	}
	
	public String getTitleFormatALabel(){
		return "����һ";
	}
	
	public String getTitleFormatBLabel(){
		return "�����";
	}
	
	public String getEngLanguageLabel(){
		return "Ӣ��";
	}
	
	public String getCHLanguageLabel(){
		return "����";
	}
	@Override
	public String getNextPage() {
		// TODO Auto-generated method stub
		return "��һҳ";
	}

	@Override
	public String getPrePage() {
		// TODO Auto-generated method stub
		return "��һҳ";
	}
}
