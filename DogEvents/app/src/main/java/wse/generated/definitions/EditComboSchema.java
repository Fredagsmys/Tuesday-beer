/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class EditComboSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #comboID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #difficulty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #visibility} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditComboRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String comboID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 * <b>Restrictions:</b> <ul>
		 * <b> enumeration: </b> BEGINNER <p>
		 * <b> enumeration: </b> INTERMEDIATE <p>
		 * <b> enumeration: </b> ELITE <p>
		 * </ul>
		 */
		public String difficulty;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 * <b>Restrictions:</b> <ul>
		 * <b> enumeration: </b> public <p>
		 * <b> enumeration: </b> friendsOnly <p>
		 * <b> enumeration: </b> private <p>
		 * </ul>
		 */
		public String visibility;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:EditCombo", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:EditCombo", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_comboID(XMLElement xml) {
			this.comboID = parse(xml, "comboID", "wse:EditCombo", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_comboID(XMLElement xml) {
			print(xml, "comboID", "wse:EditCombo", this.comboID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:EditCombo", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:EditCombo", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_difficulty(XMLElement xml) {
			this.difficulty = parse(xml, "difficulty", "wse:EditCombo", wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void create_difficulty(XMLElement xml) {
			print(xml, "difficulty", "wse:EditCombo", this.difficulty, wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void load_visibility(XMLElement xml) {
			this.visibility = parse(xml, "visibility", "wse:EditCombo", wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void create_visibility(XMLElement xml) {
			print(xml, "visibility", "wse:EditCombo", this.visibility, wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
				load_comboID(xml);
				load_name(xml);
				load_difficulty(xml);
				load_visibility(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditCombo':'EditComboRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
				create_comboID(xml);
				create_name(xml);
				create_difficulty(xml);
				create_visibility(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditCombo':'EditComboRequestType':\n" + e.getMessage(), e);
			}
		}
		public EditComboRequestType(EditComboRequestType copy) { load(copy); }
		public void load(EditComboRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.comboID = copy.comboID;
			this.name = copy.name;
			this.difficulty = copy.difficulty;
			this.visibility = copy.visibility;
		}
		public EditComboRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public EditComboRequestType comboID(String comboID){ this.comboID = comboID; return this;}
		public EditComboRequestType name(String name){ this.name = name; return this;}
		public EditComboRequestType difficulty(String difficulty){ this.difficulty = difficulty; return this;}
		public EditComboRequestType visibility(String visibility){ this.visibility = visibility; return this;}
		public EditComboRequestType() {}
		public EditComboRequestType(XMLElement xml) { this.load(xml); }
		public EditComboRequestType(
			String sessionID,
			String comboID,
			String name,
			String difficulty,
			String visibility
			) {
			this.sessionID = sessionID;
			this.comboID = comboID;
			this.name = name;
			this.difficulty = difficulty;
			this.visibility = visibility;
		}
		// Additional
	} // class EditComboRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditComboResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:EditCombo", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:EditCombo", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditCombo':'EditComboResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditCombo':'EditComboResponseType':\n" + e.getMessage(), e);
			}
		}
		public EditComboResponseType(EditComboResponseType copy) { load(copy); }
		public void load(EditComboResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public EditComboResponseType status(Integer status){ this.status = status; return this;}
		public EditComboResponseType() {}
		public EditComboResponseType(XMLElement xml) { this.load(xml); }
		public EditComboResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class EditComboResponseType
	
}
