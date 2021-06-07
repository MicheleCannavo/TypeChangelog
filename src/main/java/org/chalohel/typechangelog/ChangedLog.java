package org.chalohel.typechangelog;

/**
 *
 * Tipo Changed log.
 * Comunica i cambiamenti di funzionalità fatte al progetto.
 */
public class ChangedLog extends AbstractTypeChagelog {

  /**
   * Istanzia un nuovo Changed log.
   */
  public ChangedLog() {
    super("~", "CHANGED");
  }
}