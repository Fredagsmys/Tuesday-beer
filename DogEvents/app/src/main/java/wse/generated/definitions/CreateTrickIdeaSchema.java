/**
 *  --- GENERATED FILE --- DO NOT EDIT --- 
 * 
 * This class was generated using Web Service Engine and should never be edited.
 * 
 * https://wse.app/
 */
package wse.generated.definitions;

import wse.utils.xml.XMLElement;

public class CreateTrickIdeaSchema {
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #trickIdea} <ul><b>Type:</b> wse.generated.definitions.Turbo_DBSchema.TrickIdea <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateTrickIdeaRequestType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public wse.generated.definitions.Turbo_DBSchema.TrickIdea trickIdea;
		
		protected void load_trickIdea(XMLElement xml) {
			this.trickIdea = parseComplex(xml, "trickIdea", "wse:CreateTrickIdea", wse.generated.definitions.Turbo_DBSchema.TrickIdea.class, true);
		}
		protected void create_trickIdea(XMLElement xml) {
			printComplex(xml, "trickIdea", "wse:CreateTrickIdea", this.trickIdea, true);
		}
		public void load(XMLElement xml) {
			try {
				load_trickIdea(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateTrickIdea':'CreateTrickIdeaRequestType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_trickIdea(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateTrickIdea':'CreateTrickIdeaRequestType':\n" + e.getMessage(), e);
			}
		}
		public CreateTrickIdeaRequestType(CreateTrickIdeaRequestType copy) { load(copy); }
		public void load(CreateTrickIdeaRequestType copy) {
			if (copy == null) return;
			this.trickIdea = copy.trickIdea;
		}
		public CreateTrickIdeaRequestType trickIdea(wse.generated.definitions.Turbo_DBSchema.TrickIdea trickIdea){ this.trickIdea = trickIdea; return this;}
		public CreateTrickIdeaRequestType() {}
		public CreateTrickIdeaRequestType(XMLElement xml) { this.load(xml); }
		public CreateTrickIdeaRequestType(
			wse.generated.definitions.Turbo_DBSchema.TrickIdea trickIdea
			) {
			this.trickIdea = trickIdea;
		}
		// Additional
	} // class CreateTrickIdeaRequestType
	/**
	 * <b>Fields:</b> <ul>
	 * 		{@link #status} <ul><b>Type:</b> Integer <br><b>Occurs:</b> 1-1 <br></ul>
	 * </ul>
	 */
	public static class CreateTrickIdeaResponseType extends wse.utils.ComplexType {
		private static final long serialVersionUID = 1L;
		/**
		 * <b>Occurs:</b> 1-1 <p>
		 */
		public Integer status;
		
		protected void load_status(XMLElement xml) {
			this.status = parse(xml, "status", "wse:CreateTrickIdea", wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		protected void create_status(XMLElement xml) {
			print(xml, "status", "wse:CreateTrickIdea", this.status, wse.utils.types.xsd.xsd_int.class, true, "0");
		}
		public void load(XMLElement xml) {
			try {
				load_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseParsingException("Failed to load 'wse:CreateTrickIdea':'CreateTrickIdeaResponseType':\n" + e.getMessage(), e);
			}
		}
		public void create(XMLElement xml) {
			try {
				create_status(xml);
			} catch (Exception e) {
				throw new wse.utils.exception.WseBuildingException("Failed to create 'wse:CreateTrickIdea':'CreateTrickIdeaResponseType':\n" + e.getMessage(), e);
			}
		}
		public CreateTrickIdeaResponseType(CreateTrickIdeaResponseType copy) { load(copy); }
		public void load(CreateTrickIdeaResponseType copy) {
			if (copy == null) return;
			this.status = copy.status;
		}
		public CreateTrickIdeaResponseType status(Integer status){ this.status = status; return this;}
		public CreateTrickIdeaResponseType() {}
		public CreateTrickIdeaResponseType(XMLElement xml) { this.load(xml); }
		public CreateTrickIdeaResponseType(
			Integer status
			) {
			this.status = status;
		}
		// Additional
	} // class CreateTrickIdeaResponseType
	
}
