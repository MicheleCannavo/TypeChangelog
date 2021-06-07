package org.chalohel.typechangelog;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe astratta che si occupa di
 * gestire i tipi per il changelog.
 *
 * @author  Cannavo' Michele
 * @version 0.8.0
 * @since   23/05/2021
 */
public abstract class AbstractTypeChagelog {

  private final String symbolType;
  private final String nameType;
  private List<String> listaAdd;

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
    this.listaAdd   = new ArrayList<>();
  }

  public List<String> getListaAdd() {
    return listaAdd;
  }

  public void setListaAdd(List<String> listaAdd) {
    this.listaAdd = listaAdd;
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
   */
  public void add(String item) {
    listaAdd.add(item);
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

    for(String str : listaAdd) {
      sb.append(getSymbolType())
        .append(" ")
        .append(str)
        .append(System.lineSeparator());
    }
    return sb.toString();

  }

  /**
   * Formatta la lista compatta della singola tipologia in:
   *
   * **TYPE**
   *
   * - ITEM
   * - ITEM
   * - ITEM
   *
   * @return la stringa formattata in modo Normal
   */
  public String getFormatNormalList() {
    StringBuilder sb = new StringBuilder("");

    if(!listaAdd.isEmpty()) {

      sb.append("**")
        .append(nameType)
        .append("**")
        .append(System.lineSeparator());

      for(String str : listaAdd) {
        sb.append("- ").append(str).append(System.lineSeparator());
      }
    }
    return sb.toString();
  }
}