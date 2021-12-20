/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 9 December 2021 16:32:15 +0100
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.internal.IElement;

public class Drink_DBSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #users} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Drink_DBSchema.User&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * </ul>
	 */
	public static class Drink_DB extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Drink_DBSchema.User> users;
		
		protected void load_users(IElement xml) {
			this.users = parseComplexList(xml, "users", "wse:Drink_DB", wse.generated.definitions.Drink_DBSchema.User.class, 0, null);
		}
		protected void create_users(IElement xml) {
			printComplexList(xml, "users", "wse:Drink_DB", this.users, 0, null);
		}
		public void load(IElement xml) {
			try {
				load_users(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Drink_DB':'Drink_DB':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_users(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Drink_DB':'Drink_DB':\n" + e.getMessage(), e);
			}
		}
		public Drink_DB(Drink_DB copy) { load(copy); }
		public void load(Drink_DB copy) {
			if (copy == null) return;
			this.users = copy.users;
		}
		public Drink_DB users(java.util.List<wse.generated.definitions.Drink_DBSchema.User> users){ this.users = users; return this;}
		public Drink_DB() {}
		public Drink_DB(IElement xml) { this.load(xml); }
		public Drink_DB(
			java.util.List<wse.generated.definitions.Drink_DBSchema.User> users
			) {
			this.users = users;
		}
		// Additional
	} // class Drink_DB
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #username} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #password} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #drinks} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Drink_DBSchema.Drink&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
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
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Drink_DBSchema.Drink> drinks;
		
		protected void load_username(IElement xml) {
			this.username = parse(xml, "username", "wse:Drink_DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_username(IElement xml) {
			print(xml, "username", "wse:Drink_DB", this.username, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_password(IElement xml) {
			this.password = parse(xml, "password", "wse:Drink_DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_password(IElement xml) {
			print(xml, "password", "wse:Drink_DB", this.password, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_drinks(IElement xml) {
			this.drinks = parseComplexList(xml, "drinks", "wse:Drink_DB", wse.generated.definitions.Drink_DBSchema.Drink.class, 0, null);
		}
		protected void create_drinks(IElement xml) {
			printComplexList(xml, "drinks", "wse:Drink_DB", this.drinks, 0, null);
		}
		public void load(IElement xml) {
			try {
				load_username(xml);
				load_password(xml);
				load_drinks(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Drink_DB':'User':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_username(xml);
				create_password(xml);
				create_drinks(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Drink_DB':'User':\n" + e.getMessage(), e);
			}
		}
		public User(User copy) { load(copy); }
		public void load(User copy) {
			if (copy == null) return;
			this.username = copy.username;
			this.password = copy.password;
			this.drinks = copy.drinks;
		}
		public User username(String username){ this.username = username; return this;}
		public User password(String password){ this.password = password; return this;}
		public User drinks(java.util.List<wse.generated.definitions.Drink_DBSchema.Drink> drinks){ this.drinks = drinks; return this;}
		public User() {}
		public User(IElement xml) { this.load(xml); }
		public User(
			String username,
			String password,
			java.util.List<wse.generated.definitions.Drink_DBSchema.Drink> drinks
			) {
			this.username = username;
			this.password = password;
			this.drinks = drinks;
		}
		// Additional
	} // class User
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #name} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #alcohol} <ul><b>Type:</b> Float <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #rating} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class Drink extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String name;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Float alcohol;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer rating;
		
		protected void load_name(IElement xml) {
			this.name = parse(xml, "name", "wse:Drink_DB", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_name(IElement xml) {
			print(xml, "name", "wse:Drink_DB", this.name, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_alcohol(IElement xml) {
			this.alcohol = parse(xml, "alcohol", "wse:Drink_DB", wse.utils.types.xsd.xsd_float.class, true, null);
		}
		protected void create_alcohol(IElement xml) {
			print(xml, "alcohol", "wse:Drink_DB", this.alcohol, wse.utils.types.xsd.xsd_float.class, true, null);
		}
		protected void load_rating(IElement xml) {
			this.rating = parse(xml, "rating", "wse:Drink_DB", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_rating(IElement xml) {
			print(xml, "rating", "wse:Drink_DB", this.rating, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		public void load(IElement xml) {
			try {
				load_name(xml);
				load_alcohol(xml);
				load_rating(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:Drink_DB':'Drink':\n" + e.getMessage(), e);
			}
		}
		public void create(IElement xml) {
			try {
				create_name(xml);
				create_alcohol(xml);
				create_rating(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:Drink_DB':'Drink':\n" + e.getMessage(), e);
			}
		}
		public Drink(Drink copy) { load(copy); }
		public void load(Drink copy) {
			if (copy == null) return;
			this.name = copy.name;
			this.alcohol = copy.alcohol;
			this.rating = copy.rating;
		}
		public Drink name(String name){ this.name = name; return this;}
		public Drink alcohol(Float alcohol){ this.alcohol = alcohol; return this;}
		public Drink rating(Integer rating){ this.rating = rating; return this;}
		public Drink() {}
		public Drink(IElement xml) { this.load(xml); }
		public Drink(
			String name,
			Float alcohol,
			Integer rating
			) {
			this.name = name;
			this.alcohol = alcohol;
			this.rating = rating;
		}
		// Additional
	} // class Drink
	
}
