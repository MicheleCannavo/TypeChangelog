package org.chalohel.typechangelog;

/**
 *
 * Tipo Added log.
 * Comunica le aggiunte di funzionalità fatte al progetto.
 */
public class AddedLog extends AbstractTypeChagelog {

  /**
   * Istanzia un nuovo Added log. Utilizza il simbolo '+'
   */
  public AddedLog() {
    super("+", "ADDED");
  }
}