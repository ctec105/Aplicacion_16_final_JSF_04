package pe.edu.aprender.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;

public class JSFListener implements PhaseListener {

	private static final long serialVersionUID = 1L;
	
	static Logger logger = Logger.getLogger(JSFListener.class.getName());

	public void beforePhase(PhaseEvent arg0) {
		logger.info("Antes de fase: " + arg0.getPhaseId());
	}

	public void afterPhase(PhaseEvent arg0) {
		logger.info("Despues de fase: " + arg0.getPhaseId());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}