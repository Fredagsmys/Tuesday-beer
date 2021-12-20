/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class DeleteWorkoutSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #workoutID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteWorkoutRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String workoutID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_workoutID(XMLElement xml) {
			this.workoutID = parse(xml, "workoutID", "wse:DeleteWorkout", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_workoutID(XMLElement xml) {
			print(xml, "workoutID", "wse:DeleteWorkout", this.workoutID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:DeleteWorkout", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:DeleteWorkout", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_workoutID(xml);
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteWorkout':'DeleteWorkoutRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_workoutID(xml);
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteWorkout':'DeleteWorkoutRequestType':\n" + e.getMessage(), e);
			}
		}
		public DeleteWorkoutRequestType(DeleteWorkoutRequestType copy) { load(copy); }
		public void load(DeleteWorkoutRequestType copy) {
			if (copy == null) return;
			this.workoutID = copy.workoutID;
			this.sessionID = copy.sessionID;
		}
		public DeleteWorkoutRequestType workoutID(String workoutID){ this.workoutID = workoutID; return this;}
		public DeleteWorkoutRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public DeleteWorkoutRequestType() {}
		public DeleteWorkoutRequestType(XMLElement xml) { this.load(xml); }
		public DeleteWorkoutRequestType(
			String workoutID,
			String sessionID
			) {
			this.workoutID = workoutID;
			this.sessionID = sessionID;
		}
		// Additional
	} // class DeleteWorkoutRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DeleteWorkoutResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:DeleteWorkout", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:DeleteWorkout", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DeleteWorkout':'DeleteWorkoutResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DeleteWorkout':'DeleteWorkoutResponseType':\n" + e.getMessage(), e);
			}
		}
		public DeleteWorkoutResponseType(DeleteWorkoutResponseType copy) { load(copy); }
		public void load(DeleteWorkoutResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public DeleteWorkoutResponseType status(Integer status){ this.status = status; return this;}
		public DeleteWorkoutResponseType() {}
		public DeleteWorkoutResponseType(XMLElement xml) { this.load(xml); }
		public DeleteWorkoutResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class DeleteWorkoutResponseType
	
}
