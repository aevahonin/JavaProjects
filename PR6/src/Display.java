public class Display {
        private final int displayDiagonal;
        private final int displayWeight;
        private final DisplayType matrixType;

        public Display(int displayDiagonal, int displayWeight, DisplayType matrixType) {
            this.displayDiagonal = displayDiagonal;
            this.displayWeight = displayWeight;
            this.matrixType = matrixType;
        }
        public int getDisplayDiagonal() {
            return displayDiagonal;
        }
        public int getDisplayWeight() {
            return displayWeight;
        }
        public DisplayType getMatrixType() {
            return matrixType;
        }
}
