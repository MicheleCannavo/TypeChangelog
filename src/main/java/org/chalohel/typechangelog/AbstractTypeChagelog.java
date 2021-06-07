package org.chalohel.typechangelog;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe astratta che si occupa di
 * gestire i tipi per il changelog.
 *
 * @author Cannavo ' Michele
 * @version 0.8.0
 * @since 23 /05/2021
 */
public abstract class AbstractTypeChagelog {

  /**
   * The Symbol type.
   */
  private final String symbolType;
  /**
   * The Name type.
   */
  private final String nameType;
  /**
   * The Lista items.
   */
  private List<String> listaItems;

  /**
   * Costruttore delle classi che per i vari type changelog.
   * Per estendere questa classe astratta, basta solamente
   * chiamare il costruttore con i paramatri richiesti.
   * Tutti i metodi sono già implementati. Ogni classe differisce solo per
   * il symbolType e il nameType
   *
   * @param symbolT Simbolo associato al Type Changelog
   * @param nameT   Nome associato al Type changelog
   */
  protected AbstractTypeChagelog(String symbolT, String nameT) {
    this.symbolType = symbolT;
    this.nameType   = nameT;
    this.listaItems = new ArrayList<>();
  }

  /**
   * Gets lista items.
   *
   * @return the lista items
   */
  public List<String> getListaItems() {
    return listaItems;
  }

  /**
   * Sets lista items.
   *
   * @param listaItems the lista items
   */
  public void setListaItems(List<String> listaItems) {
    this.listaItems = listaItems;
  }

  /**
   * Questo metodo restituisce una stringa che riporta il simbolo
   * del type Implementato formattato col grassetto
   *
   * @return il simbolo in grassetto
   */
  public String getSymbolType() {
    return "**"+symbolType+"**";
  }

  /**
   * Permette di aggiunge una voce alla relativa lista di cheange
   *
   * @param item the item
   */
  public void add(String item) {
    listaItems.add(item);
  }

  /**
   * Formatta la **lista** compatta della singola tipologia in:
   * <br/>
   * **SIMBOL** ITEM<br/>
   * **SIMBOL** ITEM<br/>
   * **SIMBOL** ITEM<br/>
   *
   * @return la stringa formattata in modo compatto.
   */
  public String getFormatCompactList() {
    StringBuilder sb = new StringBuilder("");

    for(String str : listaItems) {
      sb.append(getSymbolType())
        .append(" ")
        .append(str)
        .append(System.lineSeparator());
    }
    return sb.toString();

  }

  /**
   * Formatta la lista compatta della singola tipologia in:
   * <p>
   * **TYPE**
   * <p>
   * - ITEM
   * - ITEM
   * - ITEM
   *
   * @return la stringa formattata in modo Normal
   */
  public String getFormatNormalList() {
    StringBuilder sb = new StringBuilder("");

    if(!listaItems.isEmpty()) {

      sb.append("**")
        .append(nameType)
        .append("**")
        .append(System.lineSeparator());

      for(String str : listaItems) {
        sb.append("- ").append(str).append(System.lineSeparator());
      }
    }
    return sb.toString();
  }
}