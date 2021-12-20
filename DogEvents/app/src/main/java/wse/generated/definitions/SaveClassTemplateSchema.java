/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class SaveClassTemplateSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #sessionID} <ul><b>Type:</b> String <br><b>Occurs:</b> 1-1 <br></ul>
	 * 		{@link #template} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.ClassTemplate <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveClassTemplateRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public String sessionID;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.ClassTemplate template;
		
		protected void load_sessionID(XMLElement xml) {
			this.sessionID = parse(xml, "sessionID", "wse:SaveClassTemplate", wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void create_sessionID(XMLElement xml) {
			print(xml, "sessionID", "wse:SaveClassTemplate", this.sessionID, wse.utils.types.xsd.xsd_string.class, true, null);
		}
		protected void load_template(XMLElement xml) {
			this.template = parseComplex(xml, "template", "wse:SaveClassTemplate", wse.generated.definitions.Turbo_DBSchema.ClassTemplate.class, true);
		}
		protected void create_template(XMLElement xml) {
			printComplex(xml, "template", "wse:SaveClassTemplate", this.template, true);
		}
		public void load(XMLElement xml) {
			try {
				load_sessionID(xml);
				load_template(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveClassTemplate':'SaveClassTemplateRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_sessionID(xml);
				create_template(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveClassTemplate':'SaveClassTemplateRequestType':\n" + e.getMessage(), e);
			}
		}
		public SaveClassTemplateRequestType(SaveClassTemplateRequestType copy) { load(copy); }
		public void load(SaveClassTemplateRequestType copy) {
			if (copy == null) return;
			this.sessionID = copy.sessionID;
			this.template = copy.template;
		}
		public SaveClassTemplateRequestType sessionID(String sessionID){ this.sessionID = sessionID; return this;}
		public SaveClassTemplateRequestType template(wse.generated.definitions.Turbo_DBSchema.ClassTemplate template){ this.template = template; return this;}
		public SaveClassTemplateRequestType() {}
		public SaveClassTemplateRequestType(XMLElement xml) { this.load(xml); }
		public SaveClassTemplateRequestType(
			String sessionID,
			wse.generated.definitions.Turbo_DBSchema.ClassTemplate template
			) {
			this.sessionID = sessionID;
			this.template = template;
		}
		// Additional
	} // class SaveClassTemplateRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class SaveClassTemplateResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:SaveClassTemplate", wse.utils.types.xsd.xsd_int.class, true, null);
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:SaveClassTemplate", this.status, wse.utils.types.xsd.xsd_int.class, true, null);
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:SaveClassTemplate':'SaveClassTemplateResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:SaveClassTemplate':'SaveClassTemplateResponseType':\n" + e.getMessage(), e);
			}
		}
		public SaveClassTemplateResponseType(SaveClassTemplateResponseType copy) { load(copy); }
		public void load(SaveClassTemplateResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public SaveClassTemplateResponseType status(Integer status){ this.status = status; return this;}
		public SaveClassTemplateResponseType() {}
		public SaveClassTemplateResponseType(XMLElement xml) { this.load(xml); }
		public SaveClassTemplateResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class SaveClassTemplateResponseType
	
}
