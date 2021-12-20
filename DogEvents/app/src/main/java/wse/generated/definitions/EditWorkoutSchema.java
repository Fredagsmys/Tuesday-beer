/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class EditWorkoutSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #workoutID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #difficulty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #visibility} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #setCount} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditWorkoutRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String workoutID;
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
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer setCount;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:EditWorkout", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:EditWorkout", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_workoutID(XMLElement xml) {
			this.workoutID = parse(xml, "workoutID", "wse:EditWorkout", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_workoutID(XMLElement xml) {
			print(xml, "workoutID", "wse:EditWorkout", this.workoutID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:EditWorkout", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:EditWorkout", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_difficulty(XMLElement xml) {
			this.difficulty = parse(xml, "difficulty", "wse:EditWorkout", wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void create_difficulty(XMLElement xml) {
			print(xml, "difficulty", "wse:EditWorkout", this.difficulty, wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void load_visibility(XMLElement xml) {
			this.visibility = parse(xml, "visibility", "wse:EditWorkout", wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void create_visibility(XMLElement xml) {
			print(xml, "visibility", "wse:EditWorkout", this.visibility, wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void load_setCount(XMLElement xml) {
			this.setCount = parse(xml, "setCount", "wse:EditWorkout", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_setCount(XMLElement xml) {
			print(xml, "setCount", "wse:EditWorkout", this.setCount, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
				load_workoutID(xml);
				load_name(xml);
				load_difficulty(xml);
				load_visibility(xml);
				load_setCount(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditWorkout':'EditWorkoutRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
				create_workoutID(xml);
				create_name(xml);
				create_difficulty(xml);
				create_visibility(xml);
				create_setCount(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditWorkout':'EditWorkoutRequestType':\n" + e.getMessage(), e);
			}
		}
		public EditWorkoutRequestType(EditWorkoutRequestType copy) { load(copy); }
		public void load(EditWorkoutRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.workoutID = copy.workoutID;
			this.name = copy.name;
			this.difficulty = copy.difficulty;
			this.visibility = copy.visibility;
			this.setCount = copy.setCount;
		}
		public EditWorkoutRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public EditWorkoutRequestType workoutID(String workoutID){ this.workoutID = workoutID; return this;}
		public EditWorkoutRequestType name(String name){ this.name = name; return this;}
		public EditWorkoutRequestType difficulty(String difficulty){ this.difficulty = difficulty; return this;}
		public EditWorkoutRequestType visibility(String visibility){ this.visibility = visibility; return this;}
		public EditWorkoutRequestType setCount(Integer setCount){ this.setCount = setCount; return this;}
		public EditWorkoutRequestType() {}
		public EditWorkoutRequestType(XMLElement xml) { this.load(xml); }
		public EditWorkoutRequestType(
			String sessionID,
			String workoutID,
			String name,
			String difficulty,
			String visibility,
			Integer setCount
			) {
			this.sessionID = sessionID;
			this.workoutID = workoutID;
			this.name = name;
			this.difficulty = difficulty;
			this.visibility = visibility;
			this.setCount = setCount;
		}
		// Additional
	} // class EditWorkoutRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class EditWorkoutResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:EditWorkout", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:EditWorkout", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:EditWorkout':'EditWorkoutResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:EditWorkout':'EditWorkoutResponseType':\n" + e.getMessage(), e);
			}
		}
		public EditWorkoutResponseType(EditWorkoutResponseType copy) { load(copy); }
		public void load(EditWorkoutResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public EditWorkoutResponseType status(Integer status){ this.status = status; return this;}
		public EditWorkoutResponseType() {}
		public EditWorkoutResponseType(XMLElement xml) { this.load(xml); }
		public EditWorkoutResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class EditWorkoutResponseType
	
}
