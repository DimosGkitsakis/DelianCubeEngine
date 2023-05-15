package assess.utils;

import result.Cell;

public class LabeledCell {
    public final Cell cell;
    public final String label;

    public LabeledCell(Cell cell, String label) {
        this.cell = cell;
        this.label = label;
    }

    @Override
    public String toString() {
        return "\n\nCell: " + cell.toString("\t") + "\nWas Labeled: " + label;
    }
}
