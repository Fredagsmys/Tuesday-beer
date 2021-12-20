/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class GetClassTemplateSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetClassTemplateRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:GetClassTemplate", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:GetClassTemplate", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetClassTemplate':'GetClassTemplateRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetClassTemplate':'GetClassTemplateRequestType':\n" + e.getMessage(), e);
			}
		}
		public GetClassTemplateRequestType(GetClassTemplateRequestType copy) { load(copy); }
		public void load(GetClassTemplateRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
		}
		public GetClassTemplateRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public GetClassTemplateRequestType() {}
		public GetClassTemplateRequestType(XMLElement xml) { this.load(xml); }
		public GetClassTemplateRequestType(
			String sessionID
			) {
			this.sessionID = sessionID;
		}
		// Additional
	} // class GetClassTemplateRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #classTemplates} <ul><b>Type:</b> java.util.List&lt;wse.generated.definitions.Turbo_DBSchema.ClassTemplate&gt; <br><b>Occurs:</b> 0-unbounded <br></ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class GetClassTemplateResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 0-unbounded <p>
		 */
		public java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassTemplate> classTemplates;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_classTemplates(XMLElement xml) {
			this.classTemplates = parseComplexList(xml, "classTemplates", "wse:GetClassTemplate", wse.generated.definitions.Turbo_DBSchema.ClassTemplate.class, 0, null);
		}
		protected void create_classTemplates(XMLElement xml) {
			printComplexList(xml, "classTemplates", "wse:GetClassTemplate", this.classTemplates, 0, null);
		}
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:GetClassTemplate", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:GetClassTemplate", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_classTemplates(xml);
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:GetClassTemplate':'GetClassTemplateResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_classTemplates(xml);
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:GetClassTemplate':'GetClassTemplateResponseType':\n" + e.getMessage(), e);
			}
		}
		public GetClassTemplateResponseType(GetClassTemplateResponseType copy) { load(copy); }
		public void load(GetClassTemplateResponseType copy) {
			if (copy == null) return;
			this.classTemplates = copy.classTemplates;
			this.status = copy.status;
		}
		public GetClassTemplateResponseType classTemplates(java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassTemplate> classTemplates){ this.classTemplates = classTemplates; return this;}
		public GetClassTemplateResponseType status(Integer status){ this.status = status; return this;}
		public GetClassTemplateResponseType() {}
		public GetClassTemplateResponseType(XMLElement xml) { this.load(xml); }
		public GetClassTemplateResponseType(
			java.util.List<wse.generated.definitions.Turbo_DBSchema.ClassTemplate> classTemplates,
			Integer status
			) {
			this.classTemplates = classTemplates;
			this.status = status;
		}
		// Additional
	} // class GetClassTemplateResponseType
	
}
