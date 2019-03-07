var gulp = require('gulp');
var sass = require('gulp-sass');

gulp.task('styles', function() {
    //compile and copy our sass file
    gulp.src('src/main/resources/static/assets/sass/**/*.scss')
        .pipe(sass().on('error', sass.logError))
        .pipe(gulp.dest('src/main/resources/static/assets/css/'));
    //copy over the bootstrap fonts
    gulp.src('node_modules/bootstrap-sass/assets/fonts/bootstrap/*')
        .pipe(gulp.dest('src/main/resources/static/assets/fonts/bootstrap'));
    //copy over bootstraps javascript
    gulp.src('node_modules/bootstrap-sass/assets/javascripts/*')
        .pipe(gulp.dest('src/main/resources/static/assets/js/bootstrap'));
});

//watch task
gulp.task('default',function() {
    gulp.watch('src/main/resources/static/assets/sass/**/*.scss',['styles']);
});

//these get run by gradle when building the app
gulp.task('build', ['styles']);