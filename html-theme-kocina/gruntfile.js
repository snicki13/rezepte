module.exports = function(grunt) {
    grunt.loadNpmTasks('grunt-contrib-sass');
    grunt.loadNpmTasks('grunt-codekit');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.initConfig({
        codekit: {
            build : {
                src : 'src/*.kit',
                dest : 'dist/'
            },
        },
        sass: {                              // Task
            dist: {                            // Target
                options: {                       // Target options
                    style: 'expanded'
                },
                files: {                         // Dictionary of files
                    'dist/css/main.css': 'src/scss/main.scss'       // 'destination': 'source'
                }
            }
        },
        copy: {
            main: {
                files: [
                    {expand: true, flatten: true, src: ['dist/*.html'], dest: '../backend/src/main/resources/templates'},

                    {expand: true, flatten: true, src: ['dist/js/*'], dest: '../backend/src/main/resources/static/js'},
                    {expand: true, flatten: true, src: ['dist/css/*'], dest: '../backend/src/main/resources/static/css'},

                ],
            },
        }
    });
    grunt.registerTask('build', ['codekit', 'sass', 'copy']);
}

