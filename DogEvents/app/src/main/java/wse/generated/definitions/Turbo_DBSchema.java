/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class Turbo_DBSchema {
	public static class StateEnum extends wse.utils.types.xsd.xsd_string {
		public static final String LOCKED = "LOCKED";
		public static final String WIP = "WIP";
		public static final String UNLOCKED = "UNLOCKED";
		public static String[] values() { return new String[] {
				LOCKED, WIP, UNLOCKED
		};}
		public StateEnum() {
			restriction();
			enumeration(values());
		}
		/** Convert to static enumeration string, will allow use of == operator */
		public String parse(String input) {
			for (String enumeration : values())
				if (java.util.Objects.equals(enumeration, input))
					return enumeration;
			return input;
		}
	}
	public static class DifficultyEnum extends wse.utils.types.xsd.xsd_string {
		public static final String BEGINNER = "BEGINNER";
		public static final String INTERMEDIATE = "INTERMEDIATE";
		public static final String ELITE = "ELITE";
		public static String[] values() { return new String[] {
				BEGINNER, INTERMEDIATE, ELITE
		};}
		public DifficultyEnum() {
			restriction();
			enumeration(values());
		}
		/** Convert to static enumeration string, will allow use of == operator */
		public String parse(String input) {
			for (String enumeration : values())
				if (java.util.Objects.equals(enumeration, input))
					return enumeration;
			return input;
		}
	}
	public static class UserTypeEnum extends wse.utils.types.xsd.xsd_string {
		public static final String STUDENT = "STUDENT";
		public static final String TEACHER = "TEACHER";
		public static String[] values() { return new String[] {
				STUDENT, TEACHER
		};}
		public UserTypeEnum() {
			restriction();
			enumeration(values());
		}
		/** Convert to static enumeration string, will allow use of == operator */
		public String parse(String input) {
			for (String enumeration : values())
				if (java.util.Objects.equals(enumeration, input))
					return enumeration;
			return input;
		}
	}
	public static class VisibilityEnum extends wse.utils.types.xsd.xsd_string {
		public static final String public_ = "public";
		public static final String friendsOnly = "friendsOnly";
		public static final String private_ = "private";
		public static String[] values() { return new String[] {
				public_, friendsOnly, private_
		};}
		public VisibilityEnum() {
			restriction();
			enumeration(values());
		}
		/** Convert to static enumeration string, will allow use of == operator */
		public String parse(String input) {
			for (String enumeration : values())
				if (java.util.Objects.equals(enumeration, input))
					return enumeration;
			return input;
		}
	}
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #users} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.User&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #trickIdeas} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.TrickIdea&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #classPlans} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.ClassPlan&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #dogAccount} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.DogAccount&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #dogUsers} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class Turbo_DB extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.User> users;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.TrickIdea> trickIdeas;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassPlan> classPlans;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.DogAccount> dogAccount;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> dogUsers;
		
		protected void load_users(XMLElement xml) {
			this.users = parseComplexList(xml, "users", "wse:DB", wse.generated.definitions.Turbo_DBSchema.User.class, 0, null);
		}
		protected void create_users(XMLElement xml) {
			printComplexList(xml, "users", "wse:DB", this.users, 0, null);
		}
		protected void load_trickIdeas(XMLElement xml) {
			this.trickIdeas = parseComplexList(xml, "trickIdeas", "wse:DB", wse.generated.definitions.Turbo_DBSchema.TrickIdea.class, 0, null);
		}
		protected void create_trickIdeas(XMLElement xml) {
			printComplexList(xml, "trickIdeas", "wse:DB", this.trickIdeas, 0, null);
		}
		protected void load_classPlans(XMLElement xml) {
			this.classPlans = parseComplexList(xml, "classPlans", "wse:DB", wse.generated.definitions.Turbo_DBSchema.ClassPlan.class, 0, null);
		}
		protected void create_classPlans(XMLElement xml) {
			printComplexList(xml, "classPlans", "wse:DB", this.classPlans, 0, null);
		}
		protected void load_dogAccount(XMLElement xml) {
			this.dogAccount = parseComplexList(xml, "dogAccount", "wse:DB", wse.generated.definitions.Turbo_DBSchema.DogAccount.class, 0, null);
		}
		protected void create_dogAccount(XMLElement xml) {
			printComplexList(xml, "dogAccount", "wse:DB", this.dogAccount, 0, null);
		}
		protected void load_dogUsers(XMLElement xml) {
			this.dogUsers = parseList(xml, "dogUsers", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_dogUsers(XMLElement xml) {
			printList(xml, "dogUsers", "wse:DB", this.dogUsers, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_users(xml);
				load_trickIdeas(xml);
				load_classPlans(xml);
				load_dogAccount(xml);
				load_dogUsers(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'Turbo_DB':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_users(xml);
				create_trickIdeas(xml);
				create_classPlans(xml);
				create_dogAccount(xml);
				create_dogUsers(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'Turbo_DB':\n" + e.getMessage(), e);
			}
		}
		public Turbo_DB(Turbo_DB copy) { load(copy); }
		public void load(Turbo_DB copy) {
			if (copy == null) return;
			this.users = copy.users;
			this.trickIdeas = copy.trickIdeas;
			this.classPlans = copy.classPlans;
			this.dogAccount = copy.dogAccount;
			this.dogUsers = copy.dogUsers;
		}
		public Turbo_DB users(java.util.List<wse.generated.definitions.Turbo_DBSchema.User> users){ this.users = users; return this;}
		public Turbo_DB trickIdeas(java.util.List<wse.generated.definitions.Turbo_DBSchema.TrickIdea> trickIdeas){ this.trickIdeas = trickIdeas; return this;}
		public Turbo_DB classPlans(java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassPlan> classPlans){ this.classPlans = classPlans; return this;}
		public Turbo_DB dogAccount(java.util.List<wse.generated.definitions.Turbo_DBSchema.DogAccount> dogAccount){ this.dogAccount = dogAccount; return this;}
		public Turbo_DB dogUsers(java.util.List<String> dogUsers){ this.dogUsers = dogUsers; return this;}
		public Turbo_DB() {}
		public Turbo_DB(XMLElement xml) { this.load(xml); }
		public Turbo_DB(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.User> users,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.TrickIdea> trickIdeas,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassPlan> classPlans,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.DogAccount> dogAccount,
			java.util.List<String> dogUsers
			) {
			this.users = users;
			this.trickIdeas = trickIdeas;
			this.classPlans = classPlans;
			this.dogAccount = dogAccount;
			this.dogUsers = dogUsers;
		}
		// Additional
	} // class Turbo_DB
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #groupName} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #users} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #events} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.DogEvent&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class DogAccount extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String groupName;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> users;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.DogEvent> events;
		
		protected void load_groupName(XMLElement xml) {
			this.groupName = parse(xml, "groupName", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_groupName(XMLElement xml) {
			print(xml, "groupName", "wse:DB", this.groupName, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_users(XMLElement xml) {
			this.users = parseList(xml, "users", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_users(XMLElement xml) {
			printList(xml, "users", "wse:DB", this.users, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void load_events(XMLElement xml) {
			this.events = parseComplexList(xml, "events", "wse:DB", wse.generated.definitions.Turbo_DBSchema.DogEvent.class, 0, null);
		}
		protected void create_events(XMLElement xml) {
			printComplexList(xml, "events", "wse:DB", this.events, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_groupName(xml);
				load_users(xml);
				load_events(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'DogAccount':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_groupName(xml);
				create_users(xml);
				create_events(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'DogAccount':\n" + e.getMessage(), e);
			}
		}
		public DogAccount(DogAccount copy) { load(copy); }
		public void load(DogAccount copy) {
			if (copy == null) return;
			this.groupName = copy.groupName;
			this.users = copy.users;
			this.events = copy.events;
		}
		public DogAccount groupName(String groupName){ this.groupName = groupName; return this;}
		public DogAccount users(java.util.List<String> users){ this.users = users; return this;}
		public DogAccount events(java.util.List<wse.generated.definitions.Turbo_DBSchema.DogEvent> events){ this.events = events; return this;}
		public DogAccount() {}
		public DogAccount(XMLElement xml) { this.load(xml); }
		public DogAccount(
			String groupName,
			java.util.List<String> users,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.DogEvent> events
			) {
			this.groupName = groupName;
			this.users = users;
			this.events = events;
		}
		// Additional
	} // class DogAccount
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #event} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #time} <ul><b>Type:</b> Long <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #eventSetter} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class DogEvent extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String event;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Long time;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String eventSetter;
		
		protected void load_event(XMLElement xml) {
			this.event = parse(xml, "event", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_event(XMLElement xml) {
			print(xml, "event", "wse:DB", this.event, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_time(XMLElement xml) {
			this.time = parse(xml, "time", "wse:DB", wse.utils.types.xsd.xsd_long.class, true, null);
		}
		protected void create_time(XMLElement xml) {
			print(xml, "time", "wse:DB", this.time, wse.utils.types.xsd.xsd_long.class, true, null);
		}
		protected void load_eventSetter(XMLElement xml) {
			this.eventSetter = parse(xml, "eventSetter", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_eventSetter(XMLElement xml) {
			print(xml, "eventSetter", "wse:DB", this.eventSetter, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_event(xml);
				load_time(xml);
				load_eventSetter(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'DogEvent':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_event(xml);
				create_time(xml);
				create_eventSetter(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'DogEvent':\n" + e.getMessage(), e);
			}
		}
		public DogEvent(DogEvent copy) { load(copy); }
		public void load(DogEvent copy) {
			if (copy == null) return;
			this.event = copy.event;
			this.time = copy.time;
			this.eventSetter = copy.eventSetter;
		}
		public DogEvent event(String event){ this.event = event; return this;}
		public DogEvent time(Long time){ this.time = time; return this;}
		public DogEvent eventSetter(String eventSetter){ this.eventSetter = eventSetter; return this;}
		public DogEvent() {}
		public DogEvent(XMLElement xml) { this.load(xml); }
		public DogEvent(
			String event,
			Long time,
			String eventSetter
			) {
			this.event = event;
			this.time = time;
			this.eventSetter = eventSetter;
		}
		// Additional
	} // class DogEvent
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #password} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #userType} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.UserType <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #tricks} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Trick&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #combos} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Combo&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #achievements} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Achievement&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #workouts} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Workout&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #friends} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #friendReqsSent} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #friendReqsRecieved} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #classTemplates} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.ClassTemplate&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class User extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String password;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.UserType userType;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> tricks;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Achievement> achievements;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> friends;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> friendReqsSent;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> friendReqsRecieved;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassTemplate> classTemplates;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:DB", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_password(XMLElement xml) {
			this.password = parse(xml, "password", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_password(XMLElement xml) {
			print(xml, "password", "wse:DB", this.password, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_userType(XMLElement xml) {
			this.userType = parseComplex(xml, "userType", "wse:DB", wse.generated.definitions.Turbo_DBSchema.UserType.class, true);
		}
		protected void create_userType(XMLElement xml) {
			printComplex(xml, "userType", "wse:DB", this.userType, true);
		}
		protected void load_tricks(XMLElement xml) {
			this.tricks = parseComplexList(xml, "tricks", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Trick.class, 0, null);
		}
		protected void create_tricks(XMLElement xml) {
			printComplexList(xml, "tricks", "wse:DB", this.tricks, 0, null);
		}
		protected void load_combos(XMLElement xml) {
			this.combos = parseComplexList(xml, "combos", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Combo.class, 0, null);
		}
		protected void create_combos(XMLElement xml) {
			printComplexList(xml, "combos", "wse:DB", this.combos, 0, null);
		}
		protected void load_achievements(XMLElement xml) {
			this.achievements = parseComplexList(xml, "achievements", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Achievement.class, 0, null);
		}
		protected void create_achievements(XMLElement xml) {
			printComplexList(xml, "achievements", "wse:DB", this.achievements, 0, null);
		}
		protected void load_workouts(XMLElement xml) {
			this.workouts = parseComplexList(xml, "workouts", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Workout.class, 0, null);
		}
		protected void create_workouts(XMLElement xml) {
			printComplexList(xml, "workouts", "wse:DB", this.workouts, 0, null);
		}
		protected void load_friends(XMLElement xml) {
			this.friends = parseList(xml, "friends", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_friends(XMLElement xml) {
			printList(xml, "friends", "wse:DB", this.friends, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void load_friendReqsSent(XMLElement xml) {
			this.friendReqsSent = parseList(xml, "friendReqsSent", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_friendReqsSent(XMLElement xml) {
			printList(xml, "friendReqsSent", "wse:DB", this.friendReqsSent, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void load_friendReqsRecieved(XMLElement xml) {
			this.friendReqsRecieved = parseList(xml, "friendReqsRecieved", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_friendReqsRecieved(XMLElement xml) {
			printList(xml, "friendReqsRecieved", "wse:DB", this.friendReqsRecieved, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void load_classTemplates(XMLElement xml) {
			this.classTemplates = parseComplexList(xml, "classTemplates", "wse:DB", wse.generated.definitions.Turbo_DBSchema.ClassTemplate.class, 0, null);
		}
		protected void create_classTemplates(XMLElement xml) {
			printComplexList(xml, "classTemplates", "wse:DB", this.classTemplates, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
				load_password(xml);
				load_userType(xml);
				load_tricks(xml);
				load_combos(xml);
				load_achievements(xml);
				load_workouts(xml);
				load_friends(xml);
				load_friendReqsSent(xml);
				load_friendReqsRecieved(xml);
				load_classTemplates(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'User':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
				create_password(xml);
				create_userType(xml);
				create_tricks(xml);
				create_combos(xml);
				create_achievements(xml);
				create_workouts(xml);
				create_friends(xml);
				create_friendReqsSent(xml);
				create_friendReqsRecieved(xml);
				create_classTemplates(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'User':\n" + e.getMessage(), e);
			}
		}
		public User(User copy) { load(copy); }
		public void load(User copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.password = copy.password;
			this.userType = copy.userType;
			this.tricks = copy.tricks;
			this.combos = copy.combos;
			this.achievements = copy.achievements;
			this.workouts = copy.workouts;
			this.friends = copy.friends;
			this.friendReqsSent = copy.friendReqsSent;
			this.friendReqsRecieved = copy.friendReqsRecieved;
			this.classTemplates = copy.classTemplates;
		}
		public User username(String username){ this.username = username; return this;}
		public User password(String password){ this.password = password; return this;}
		public User userType(wse.generated.definitions.Turbo_DBSchema.UserType userType){ this.userType = userType; return this;}
		public User tricks(java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> tricks){ this.tricks = tricks; return this;}
		public User combos(java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos){ this.combos = combos; return this;}
		public User achievements(java.util.List<wse.generated.definitions.Turbo_DBSchema.Achievement> achievements){ this.achievements = achievements; return this;}
		public User workouts(java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts){ this.workouts = workouts; return this;}
		public User friends(java.util.List<String> friends){ this.friends = friends; return this;}
		public User friendReqsSent(java.util.List<String> friendReqsSent){ this.friendReqsSent = friendReqsSent; return this;}
		public User friendReqsRecieved(java.util.List<String> friendReqsRecieved){ this.friendReqsRecieved = friendReqsRecieved; return this;}
		public User classTemplates(java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassTemplate> classTemplates){ this.classTemplates = classTemplates; return this;}
		public User() {}
		public User(XMLElement xml) { this.load(xml); }
		public User(
			String username,
			String password,
			wse.generated.definitions.Turbo_DBSchema.UserType userType,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> tricks,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Achievement> achievements,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts,
			java.util.List<String> friends,
			java.util.List<String> friendReqsSent,
			java.util.List<String> friendReqsRecieved,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassTemplate> classTemplates
			) {
			this.username = username;
			this.password = password;
			this.userType = userType;
			this.tricks = tricks;
			this.combos = combos;
			this.achievements = achievements;
			this.workouts = workouts;
			this.friends = friends;
			this.friendReqsSent = friendReqsSent;
			this.friendReqsRecieved = friendReqsRecieved;
			this.classTemplates = classTemplates;
		}
		// Additional
	} // class User
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class UserType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_name(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'UserType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_name(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'UserType':\n" + e.getMessage(), e);
			}
		}
		public UserType(UserType copy) { load(copy); }
		public void load(UserType copy) {
			if (copy == null) return;
			this.name = copy.name;
		}
		public UserType name(String name){ this.name = name; return this;}
		public UserType() {}
		public UserType(XMLElement xml) { this.load(xml); }
		public UserType(
			String name
			) {
			this.name = name;
		}
		// Additional
	} // class UserType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #state} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class Trick extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 * <b>Restrictions:</b> <ul>
		 * <b> enumeration: </b> LOCKED <p>
		 * <b> enumeration: </b> WIP <p>
		 * <b> enumeration: </b> UNLOCKED <p>
		 * </ul>
		 */
		public String state;
		
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_state(XMLElement xml) {
			this.state = parse(xml, "state", "wse:DB", wse.generated.definitions.Turbo_DBSchema.StateEnum.class, true, null);
		}
		protected void create_state(XMLElement xml) {
			print(xml, "state", "wse:DB", this.state, wse.generated.definitions.Turbo_DBSchema.StateEnum.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_name(xml);
				load_state(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'Trick':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_name(xml);
				create_state(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'Trick':\n" + e.getMessage(), e);
			}
		}
		public Trick(Trick copy) { load(copy); }
		public void load(Trick copy) {
			if (copy == null) return;
			this.name = copy.name;
			this.state = copy.state;
		}
		public Trick name(String name){ this.name = name; return this;}
		public Trick state(String state){ this.state = state; return this;}
		public Trick() {}
		public Trick(XMLElement xml) { this.load(xml); }
		public Trick(
			String name,
			String state
			) {
			this.name = name;
			this.state = state;
		}
		// Additional
	} // class Trick
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #combos} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Combo&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #tricks} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Trick&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #workouts} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Workout&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #userType} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.UserType <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class Friend extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String username;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> tricks;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.UserType userType;
		
		protected void load_username(XMLElement xml) {
			this.username = parse(xml, "username", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(XMLElement xml) {
			print(xml, "username", "wse:DB", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_combos(XMLElement xml) {
			this.combos = parseComplexList(xml, "combos", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Combo.class, 0, null);
		}
		protected void create_combos(XMLElement xml) {
			printComplexList(xml, "combos", "wse:DB", this.combos, 0, null);
		}
		protected void load_tricks(XMLElement xml) {
			this.tricks = parseComplexList(xml, "tricks", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Trick.class, 0, null);
		}
		protected void create_tricks(XMLElement xml) {
			printComplexList(xml, "tricks", "wse:DB", this.tricks, 0, null);
		}
		protected void load_workouts(XMLElement xml) {
			this.workouts = parseComplexList(xml, "workouts", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Workout.class, 0, null);
		}
		protected void create_workouts(XMLElement xml) {
			printComplexList(xml, "workouts", "wse:DB", this.workouts, 0, null);
		}
		protected void load_userType(XMLElement xml) {
			this.userType = parseComplex(xml, "userType", "wse:DB", wse.generated.definitions.Turbo_DBSchema.UserType.class, true);
		}
		protected void create_userType(XMLElement xml) {
			printComplex(xml, "userType", "wse:DB", this.userType, true);
		}
		public void load(XMLElement xml) {
			try {
				load_username(xml);
				load_combos(xml);
				load_tricks(xml);
				load_workouts(xml);
				load_userType(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'Friend':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_username(xml);
				create_combos(xml);
				create_tricks(xml);
				create_workouts(xml);
				create_userType(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'Friend':\n" + e.getMessage(), e);
			}
		}
		public Friend(Friend copy) { load(copy); }
		public void load(Friend copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.combos = copy.combos;
			this.tricks = copy.tricks;
			this.workouts = copy.workouts;
			this.userType = copy.userType;
		}
		public Friend username(String username){ this.username = username; return this;}
		public Friend combos(java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos){ this.combos = combos; return this;}
		public Friend tricks(java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> tricks){ this.tricks = tricks; return this;}
		public Friend workouts(java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts){ this.workouts = workouts; return this;}
		public Friend userType(wse.generated.definitions.Turbo_DBSchema.UserType userType){ this.userType = userType; return this;}
		public Friend() {}
		public Friend(XMLElement xml) { this.load(xml); }
		public Friend(
			String username,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Combo> combos,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> tricks,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Workout> workouts,
			wse.generated.definitions.Turbo_DBSchema.UserType userType
			) {
			this.username = username;
			this.combos = combos;
			this.tricks = tricks;
			this.workouts = workouts;
			this.userType = userType;
		}
		// Additional
	} // class Friend
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #comboTrick} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Trick&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #difficulty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #visibilty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #comboID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class Combo extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> comboTrick;
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
		public String visibilty;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String comboID;
		
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_comboTrick(XMLElement xml) {
			this.comboTrick = parseComplexList(xml, "comboTrick", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Trick.class, 0, null);
		}
		protected void create_comboTrick(XMLElement xml) {
			printComplexList(xml, "comboTrick", "wse:DB", this.comboTrick, 0, null);
		}
		protected void load_difficulty(XMLElement xml) {
			this.difficulty = parse(xml, "difficulty", "wse:DB", wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void create_difficulty(XMLElement xml) {
			print(xml, "difficulty", "wse:DB", this.difficulty, wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void load_visibilty(XMLElement xml) {
			this.visibilty = parse(xml, "visibilty", "wse:DB", wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void create_visibilty(XMLElement xml) {
			print(xml, "visibilty", "wse:DB", this.visibilty, wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void load_comboID(XMLElement xml) {
			this.comboID = parse(xml, "comboID", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_comboID(XMLElement xml) {
			print(xml, "comboID", "wse:DB", this.comboID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_name(xml);
				load_comboTrick(xml);
				load_difficulty(xml);
				load_visibilty(xml);
				load_comboID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'Combo':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_name(xml);
				create_comboTrick(xml);
				create_difficulty(xml);
				create_visibilty(xml);
				create_comboID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'Combo':\n" + e.getMessage(), e);
			}
		}
		public Combo(Combo copy) { load(copy); }
		public void load(Combo copy) {
			if (copy == null) return;
			this.name = copy.name;
			this.comboTrick = copy.comboTrick;
			this.difficulty = copy.difficulty;
			this.visibilty = copy.visibilty;
			this.comboID = copy.comboID;
		}
		public Combo name(String name){ this.name = name; return this;}
		public Combo comboTrick(java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> comboTrick){ this.comboTrick = comboTrick; return this;}
		public Combo difficulty(String difficulty){ this.difficulty = difficulty; return this;}
		public Combo visibilty(String visibilty){ this.visibilty = visibilty; return this;}
		public Combo comboID(String comboID){ this.comboID = comboID; return this;}
		public Combo() {}
		public Combo(XMLElement xml) { this.load(xml); }
		public Combo(
			String name,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Trick> comboTrick,
			String difficulty,
			String visibilty,
			String comboID
			) {
			this.name = name;
			this.comboTrick = comboTrick;
			this.difficulty = difficulty;
			this.visibilty = visibilty;
			this.comboID = comboID;
		}
		// Additional
	} // class Combo
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #reps} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #excercise} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.Excercise&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #visibilty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #workoutID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #difficulty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #muscleGroups} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class Workout extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer reps;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.Excercise> excercise;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 * <b>Restrictions:</b> <ul>
		 * <b> enumeration: </b> public <p>
		 * <b> enumeration: </b> friendsOnly <p>
		 * <b> enumeration: </b> private <p>
		 * </ul>
		 */
		public String visibilty;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String workoutID;
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
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> muscleGroups;
		
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_reps(XMLElement xml) {
			this.reps = parse(xml, "reps", "wse:DB", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_reps(XMLElement xml) {
			print(xml, "reps", "wse:DB", this.reps, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void load_excercise(XMLElement xml) {
			this.excercise = parseComplexList(xml, "excercise", "wse:DB", wse.generated.definitions.Turbo_DBSchema.Excercise.class, 0, null);
		}
		protected void create_excercise(XMLElement xml) {
			printComplexList(xml, "excercise", "wse:DB", this.excercise, 0, null);
		}
		protected void load_visibilty(XMLElement xml) {
			this.visibilty = parse(xml, "visibilty", "wse:DB", wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void create_visibilty(XMLElement xml) {
			print(xml, "visibilty", "wse:DB", this.visibilty, wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void load_workoutID(XMLElement xml) {
			this.workoutID = parse(xml, "workoutID", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_workoutID(XMLElement xml) {
			print(xml, "workoutID", "wse:DB", this.workoutID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_difficulty(XMLElement xml) {
			this.difficulty = parse(xml, "difficulty", "wse:DB", wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void create_difficulty(XMLElement xml) {
			print(xml, "difficulty", "wse:DB", this.difficulty, wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void load_muscleGroups(XMLElement xml) {
			this.muscleGroups = parseList(xml, "muscleGroups", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_muscleGroups(XMLElement xml) {
			printList(xml, "muscleGroups", "wse:DB", this.muscleGroups, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_name(xml);
				load_reps(xml);
				load_excercise(xml);
				load_visibilty(xml);
				load_workoutID(xml);
				load_difficulty(xml);
				load_muscleGroups(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'Workout':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_name(xml);
				create_reps(xml);
				create_excercise(xml);
				create_visibilty(xml);
				create_workoutID(xml);
				create_difficulty(xml);
				create_muscleGroups(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'Workout':\n" + e.getMessage(), e);
			}
		}
		public Workout(Workout copy) { load(copy); }
		public void load(Workout copy) {
			if (copy == null) return;
			this.name = copy.name;
			this.reps = copy.reps;
			this.excercise = copy.excercise;
			this.visibilty = copy.visibilty;
			this.workoutID = copy.workoutID;
			this.difficulty = copy.difficulty;
			this.muscleGroups = copy.muscleGroups;
		}
		public Workout name(String name){ this.name = name; return this;}
		public Workout reps(Integer reps){ this.reps = reps; return this;}
		public Workout excercise(java.util.List<wse.generated.definitions.Turbo_DBSchema.Excercise> excercise){ this.excercise = excercise; return this;}
		public Workout visibilty(String visibilty){ this.visibilty = visibilty; return this;}
		public Workout workoutID(String workoutID){ this.workoutID = workoutID; return this;}
		public Workout difficulty(String difficulty){ this.difficulty = difficulty; return this;}
		public Workout muscleGroups(java.util.List<String> muscleGroups){ this.muscleGroups = muscleGroups; return this;}
		public Workout() {}
		public Workout(XMLElement xml) { this.load(xml); }
		public Workout(
			String name,
			Integer reps,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.Excercise> excercise,
			String visibilty,
			String workoutID,
			String difficulty,
			java.util.List<String> muscleGroups
			) {
			this.name = name;
			this.reps = reps;
			this.excercise = excercise;
			this.visibilty = visibilty;
			this.workoutID = workoutID;
			this.difficulty = difficulty;
			this.muscleGroups = muscleGroups;
		}
		// Additional
	} // class Workout
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #reps} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #muscles} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class Excercise extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer reps;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> muscles;
		
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_reps(XMLElement xml) {
			this.reps = parse(xml, "reps", "wse:DB", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_reps(XMLElement xml) {
			print(xml, "reps", "wse:DB", this.reps, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void load_muscles(XMLElement xml) {
			this.muscles = parseList(xml, "muscles", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_muscles(XMLElement xml) {
			printList(xml, "muscles", "wse:DB", this.muscles, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_name(xml);
				load_reps(xml);
				load_muscles(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'Excercise':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_name(xml);
				create_reps(xml);
				create_muscles(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'Excercise':\n" + e.getMessage(), e);
			}
		}
		public Excercise(Excercise copy) { load(copy); }
		public void load(Excercise copy) {
			if (copy == null) return;
			this.name = copy.name;
			this.reps = copy.reps;
			this.muscles = copy.muscles;
		}
		public Excercise name(String name){ this.name = name; return this;}
		public Excercise reps(Integer reps){ this.reps = reps; return this;}
		public Excercise muscles(java.util.List<String> muscles){ this.muscles = muscles; return this;}
		public Excercise() {}
		public Excercise(XMLElement xml) { this.load(xml); }
		public Excercise(
			String name,
			Integer reps,
			java.util.List<String> muscles
			) {
			this.name = name;
			this.reps = reps;
			this.muscles = muscles;
		}
		// Additional
	} // class Excercise
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #difficulty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #state} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class Achievement extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
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
		 * <b> enumeration: </b> LOCKED <p>
		 * <b> enumeration: </b> WIP <p>
		 * <b> enumeration: </b> UNLOCKED <p>
		 * </ul>
		 */
		public String state;
		
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_difficulty(XMLElement xml) {
			this.difficulty = parse(xml, "difficulty", "wse:DB", wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void create_difficulty(XMLElement xml) {
			print(xml, "difficulty", "wse:DB", this.difficulty, wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void load_state(XMLElement xml) {
			this.state = parse(xml, "state", "wse:DB", wse.generated.definitions.Turbo_DBSchema.StateEnum.class, true, "LOCKED");
		}
		protected void create_state(XMLElement xml) {
			print(xml, "state", "wse:DB", this.state, wse.generated.definitions.Turbo_DBSchema.StateEnum.class, true, "LOCKED");
		}
		public void load(XMLElement xml) {
			try {
				load_name(xml);
				load_difficulty(xml);
				load_state(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'Achievement':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_name(xml);
				create_difficulty(xml);
				create_state(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'Achievement':\n" + e.getMessage(), e);
			}
		}
		public Achievement(Achievement copy) { load(copy); }
		public void load(Achievement copy) {
			if (copy == null) return;
			this.name = copy.name;
			this.difficulty = copy.difficulty;
			this.state = copy.state;
		}
		public Achievement name(String name){ this.name = name; return this;}
		public Achievement difficulty(String difficulty){ this.difficulty = difficulty; return this;}
		public Achievement state(String state){ this.state = state; return this;}
		public Achievement() {}
		public Achievement(XMLElement xml) { this.load(xml); }
		public Achievement(
			String name,
			String difficulty,
			String state
			) {
			this.name = name;
			this.difficulty = difficulty;
			this.state = state;
		}
		// Additional
	} // class Achievement
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #user} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #desc} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #diff} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #category} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class TrickIdea extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String user;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String desc;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 * <b>Restrictions:</b> <ul>
		 * <b> enumeration: </b> BEGINNER <p>
		 * <b> enumeration: </b> INTERMEDIATE <p>
		 * <b> enumeration: </b> ELITE <p>
		 * </ul>
		 */
		public String diff;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String category;
		
		protected void load_user(XMLElement xml) {
			this.user = parse(xml, "user", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_user(XMLElement xml) {
			print(xml, "user", "wse:DB", this.user, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_desc(XMLElement xml) {
			this.desc = parse(xml, "desc", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_desc(XMLElement xml) {
			print(xml, "desc", "wse:DB", this.desc, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_diff(XMLElement xml) {
			this.diff = parse(xml, "diff", "wse:DB", wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void create_diff(XMLElement xml) {
			print(xml, "diff", "wse:DB", this.diff, wse.generated.definitions.Turbo_DBSchema.DifficultyEnum.class, true, null);
		}
		protected void load_category(XMLElement xml) {
			this.category = parse(xml, "category", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_category(XMLElement xml) {
			print(xml, "category", "wse:DB", this.category, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_user(xml);
				load_name(xml);
				load_desc(xml);
				load_diff(xml);
				load_category(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'TrickIdea':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_user(xml);
				create_name(xml);
				create_desc(xml);
				create_diff(xml);
				create_category(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'TrickIdea':\n" + e.getMessage(), e);
			}
		}
		public TrickIdea(TrickIdea copy) { load(copy); }
		public void load(TrickIdea copy) {
			if (copy == null) return;
			this.user = copy.user;
			this.name = copy.name;
			this.desc = copy.desc;
			this.diff = copy.diff;
			this.category = copy.category;
		}
		public TrickIdea user(String user){ this.user = user; return this;}
		public TrickIdea name(String name){ this.name = name; return this;}
		public TrickIdea desc(String desc){ this.desc = desc; return this;}
		public TrickIdea diff(String diff){ this.diff = diff; return this;}
		public TrickIdea category(String category){ this.category = category; return this;}
		public TrickIdea() {}
		public TrickIdea(XMLElement xml) { this.load(xml); }
		public TrickIdea(
			String user,
			String name,
			String desc,
			String diff,
			String category
			) {
			this.user = user;
			this.name = name;
			this.desc = desc;
			this.diff = diff;
			this.category = category;
		}
		// Additional
	} // class TrickIdea
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #content} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #desc} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #visibilty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class ClassTemplate extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> content;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String desc;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 * <b>Restrictions:</b> <ul>
		 * <b> enumeration: </b> public <p>
		 * <b> enumeration: </b> friendsOnly <p>
		 * <b> enumeration: </b> private <p>
		 * </ul>
		 */
		public String visibilty;
		
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_content(XMLElement xml) {
			this.content = parseList(xml, "content", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_content(XMLElement xml) {
			printList(xml, "content", "wse:DB", this.content, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void load_desc(XMLElement xml) {
			this.desc = parse(xml, "desc", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_desc(XMLElement xml) {
			print(xml, "desc", "wse:DB", this.desc, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_visibilty(XMLElement xml) {
			this.visibilty = parse(xml, "visibilty", "wse:DB", wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void create_visibilty(XMLElement xml) {
			print(xml, "visibilty", "wse:DB", this.visibilty, wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_name(xml);
				load_content(xml);
				load_desc(xml);
				load_visibilty(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'ClassTemplate':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_name(xml);
				create_content(xml);
				create_desc(xml);
				create_visibilty(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'ClassTemplate':\n" + e.getMessage(), e);
			}
		}
		public ClassTemplate(ClassTemplate copy) { load(copy); }
		public void load(ClassTemplate copy) {
			if (copy == null) return;
			this.name = copy.name;
			this.content = copy.content;
			this.desc = copy.desc;
			this.visibilty = copy.visibilty;
		}
		public ClassTemplate name(String name){ this.name = name; return this;}
		public ClassTemplate content(java.util.List<String> content){ this.content = content; return this;}
		public ClassTemplate desc(String desc){ this.desc = desc; return this;}
		public ClassTemplate visibilty(String visibilty){ this.visibilty = visibilty; return this;}
		public ClassTemplate() {}
		public ClassTemplate(XMLElement xml) { this.load(xml); }
		public ClassTemplate(
			String name,
			java.util.List<String> content,
			String desc,
			String visibilty
			) {
			this.name = name;
			this.content = content;
			this.desc = desc;
			this.visibilty = visibilty;
		}
		// Additional
	} // class ClassTemplate
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #template} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.ClassTemplate <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #content} <ul><b>Type:</b> java.util.List&lt;String&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #desc} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #visibilty} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #editors} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.User&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class ClassPlan extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.ClassTemplate template;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<String> content;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String desc;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 * <b>Restrictions:</b> <ul>
		 * <b> enumeration: </b> public <p>
		 * <b> enumeration: </b> friendsOnly <p>
		 * <b> enumeration: </b> private <p>
		 * </ul>
		 */
		public String visibilty;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.User> editors;
		
		protected void load_template(XMLElement xml) {
			this.template = parseComplex(xml, "template", "wse:DB", wse.generated.definitions.Turbo_DBSchema.ClassTemplate.class, true);
		}
		protected void create_template(XMLElement xml) {
			printComplex(xml, "template", "wse:DB", this.template, true);
		}
		protected void load_name(XMLElement xml) {
			this.name = parse(xml, "name", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(XMLElement xml) {
			print(xml, "name", "wse:DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_content(XMLElement xml) {
			this.content = parseList(xml, "content", "wse:DB", wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void create_content(XMLElement xml) {
			printList(xml, "content", "wse:DB", this.content, wse.utils.types.xsd.xsd_string.class, 0, null);
		}
		protected void load_desc(XMLElement xml) {
			this.desc = parse(xml, "desc", "wse:DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_desc(XMLElement xml) {
			print(xml, "desc", "wse:DB", this.desc, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_visibilty(XMLElement xml) {
			this.visibilty = parse(xml, "visibilty", "wse:DB", wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void create_visibilty(XMLElement xml) {
			print(xml, "visibilty", "wse:DB", this.visibilty, wse.generated.definitions.Turbo_DBSchema.VisibilityEnum.class, true, null);
		}
		protected void load_editors(XMLElement xml) {
			this.editors = parseComplexList(xml, "editors", "wse:DB", wse.generated.definitions.Turbo_DBSchema.User.class, 0, null);
		}
		protected void create_editors(XMLElement xml) {
			printComplexList(xml, "editors", "wse:DB", this.editors, 0, null);
		}
		public void load(XMLElement xml) {
			try {
				load_template(xml);
				load_name(xml);
				load_content(xml);
				load_desc(xml);
				load_visibilty(xml);
				load_editors(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:DB':'ClassPlan':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_template(xml);
				create_name(xml);
				create_content(xml);
				create_desc(xml);
				create_visibilty(xml);
				create_editors(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:DB':'ClassPlan':\n" + e.getMessage(), e);
			}
		}
		public ClassPlan(ClassPlan copy) { load(copy); }
		public void load(ClassPlan copy) {
			if (copy == null) return;
			this.template = copy.template;
			this.name = copy.name;
			this.content = copy.content;
			this.desc = copy.desc;
			this.visibilty = copy.visibilty;
			this.editors = copy.editors;
		}
		public ClassPlan template(wse.generated.definitions.Turbo_DBSchema.ClassTemplate template){ this.template = template; return this;}
		public ClassPlan name(String name){ this.name = name; return this;}
		public ClassPlan content(java.util.List<String> content){ this.content = content; return this;}
		public ClassPlan desc(String desc){ this.desc = desc; return this;}
		public ClassPlan visibilty(String visibilty){ this.visibilty = visibilty; return this;}
		public ClassPlan editors(java.util.List<wse.generated.definitions.Turbo_DBSchema.User> editors){ this.editors = editors; return this;}
		public ClassPlan() {}
		public ClassPlan(XMLElement xml) { this.load(xml); }
		public ClassPlan(
			wse.generated.definitions.Turbo_DBSchema.ClassTemplate template,
			String name,
			java.util.List<String> content,
			String desc,
			String visibilty,
			java.util.List<wse.generated.definitions.Turbo_DBSchema.User> editors
			) {
			this.template = template;
			this.name = name;
			this.content = content;
			this.desc = desc;
			this.visibilty = visibilty;
			this.editors = editors;
		}
		// Additional
	} // class ClassPlan
	
}
